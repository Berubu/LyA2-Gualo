import json
from WebGenParser import WebGenParser
from WebGenVisitor import WebGenVisitor

class CodeGenerator(WebGenVisitor):

    def __init__(self):
        self.html = []
        self.css = []
        self.crud_spec = {}

    # --- Métodos de Ayuda ---
    
    # Quita las comillas de un token STRING (rectas o inteligentes)
    def unquote(self, text):
        if text.startswith('"') and text.endswith('"'):
            return text[1:-1]
        if text.startswith('“') and text.endswith('”'):
            return text[1:-1]
        return text

    # --- Métodos del Visitor ---

    def visitPagina(self, ctx:WebGenParser.PaginaContext):
        self.html.append("<!DOCTYPE html>")
        self.html.append("<html>")
        self.html.append("<head>")
        self.html.append("  <title>Página Generada</title>")
        self.html.append("  <meta charset='UTF-8'>") 
        self.html.append("  <link rel='stylesheet' href='style.css'>")
        self.html.append("</head>")
        self.html.append("<body>")
        self.html.append("  <div class='container'>")
        
        self.visitChildren(ctx)
        
        self.html.append("  </div>")
        self.html.append("</body>")
        self.html.append("</html>")
        
        self.css.append("body { font-family: Arial, sans-serif; margin: 20px; background-color: #f4f4f4; }")
        self.css.append(".container { max-width: 900px; margin: auto; background: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }")

    def visitTitulo(self, ctx:WebGenParser.TituloContext):
        text = self.unquote(ctx.STRING().getText())
        self.html.append(f"    <h1>{text}</h1>")
        self.css.append("h1 { color: #333; text-align: center; }")

    def visitLinea(self, ctx:WebGenParser.LineaContext):
        self.html.append("    <hr>")
        self.css.append("hr { border: 0; border-top: 1px solid #eee; margin: 20px 0; }")

    def visitMenu(self, ctx:WebGenParser.MenuContext):
        self.html.append("    <nav class='main-menu'>")
        self.html.append("      <a href='#'>Inicio</a>")
        self.html.append("      <a href='#'>Productos</a>")
        self.html.append("      <a href='#'>Contacto</a>")
        self.html.append("    </nav>")
        self.css.append(".main-menu { text-align: center; background: #333; padding: 10px 0; }")
        self.css.append(".main-menu a { color: white; padding: 10px 15px; text-decoration: none; }")
        self.css.append(".main-menu a:hover { background: #555; }")

    # ---- ¡ESTA ES LA FUNCIÓN ACTUALIZADA! ----
    def visitSeccionImagenes(self, ctx:WebGenParser.SeccionImagenesContext):
        self.html.append("    <div class='image-gallery'>")
        
        # Itera sobre la lista de STRINGs (si es que hay)
        for img_node in ctx.STRING():
            path = self.unquote(img_node.getText()) # Necesita unquote
            self.html.append(f"      <img src='{path}' alt='{path}'>")
            
        # Itera sobre la lista de FILENAMEs (si es que hay)
        for img_node in ctx.FILENAME():
            path = img_node.getText() # No necesita unquote
            self.html.append(f"      <img src='{path}' alt='{path}'>")

        self.html.append("    </div>")
        self.css.append(".image-gallery { display: flex; gap: 10px; justify-content: center; flex-wrap: wrap; margin: 20px 0; }")
        self.css.append(".image-gallery img { max-width: 200px; max-height: 150px; border: 1px solid #ccc; border-radius: 4px; }")


    def visitTexto(self, ctx:WebGenParser.TextoContext):
        text = self.unquote(ctx.STRING().getText())
        self.html.append(f"    <p>{text}</p>")
        self.css.append("p { font-size: 16px; line-height: 1.6; color: #555; }")
        
    def visitSeccionAcercade(self, ctx:WebGenParser.SeccionAcercadeContext):
        self.html.append("    <footer>")
        self.html.append("      <h3>Acerca de</h3>")
        for prop in ctx.propiedad():
            key = prop.ID().getText()
            value = self.unquote(prop.STRING().getText())
            self.html.append(f"      <p><strong>{key}:</strong> {value}</p>")
        self.html.append("    </footer>")
        self.css.append("footer { background-color: #f9f9f9; border-top: 2px solid #eee; padding: 20px; margin-top: 30px; border-radius: 0 0 8px 8px; }")

    def visitCrud(self, ctx:WebGenParser.CrudContext):
        db_name = ctx.bdd().ID().getText()
        table_name = ctx.tabla().ID().getText()
        
        fields = []
        for campo_node in ctx.tabla().campo():
            fields.append(campo_node.ID().getText())

        self.crud_spec = {
            'database': db_name,
            'table': table_name,
            'fields': fields
        }

        self.html.append("    <div class='crud-section'>")
        self.html.append("      <h2>Operaciones CRUD (Unidad 4)</h2>")
        self.html.append("      <p>Esta sección se conectará a PHP según la especificación generada.</p>")
        self.html.append(f"      <p><strong>Base de Datos:</strong> {db_name}</p>")
        self.html.append(f"      <p><strong>Tabla:</strong> {table_name}</p>")
        self.html.append(f"      <p><strong>Campos:</strong> {', '.join(fields)}</p>")
        self.html.append("    </div>")
        self.css.append(".crud-section { border: 2px dashed #007bff; padding: 15px; background: #f0f8ff; border-radius: 5px; margin: 20px 0; }")