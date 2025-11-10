import sys
import json
from antlr4 import *
from WebGenLexer import WebGenLexer
from WebGenParser import WebGenParser
from CodeGenerator import CodeGenerator

def main(argv):
    # --- 1. CONFIGURACIÓN DE ENTRADA ---
    # Comprueba que se haya dado un archivo de entrada
    if len(argv) < 2:
        print("Error: Debes proporcionar un archivo de entrada.")
        print("Uso: python compile.py mi_pagina.txt")
        return
        
    input_filename = argv[1]
    
    # Define los nombres de los archivos de salida
    output_html = "pagina_generada.html"
    output_css = "style.css"
    output_json = "crud_spec.json"

    print(f"Iniciando compilación de: {input_filename}")

    try:
        # --- 2. PROCESO DE ANTLR (LEXER Y PARSER) ---
        input_stream = FileStream(input_filename, encoding='utf-8')
        lexer = WebGenLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = WebGenParser(stream)
        
        # Iniciar el análisis desde la regla 'pagina'
        # Esto construye el ParseTree (el árbol sintáctico)
        tree = parser.pagina()

        # --- 3. PROCESO DEL VISITOR (GENERACIÓN DE CÓDIGO) ---
        print("Árbol sintáctico creado. Generando código...")
        generator = CodeGenerator()
        generator.visit(tree) # ¡Aquí ocurre la magia!

        # --- 4. ESCRITURA DE ARCHIVOS DE SALIDA ---
        
        # HTML
        with open(output_html, "w", encoding='utf-8') as f:
            f.write("\n".join(generator.html))

        # CSS
        with open(output_css, "w", encoding='utf-8') as f:
            f.write("\n".join(generator.css))
            
        # Especificación CRUD (JSON)
        # Usamos 'json.dump' para un formato bonito
        with open(output_json, "w", encoding='utf-8') as f:
            json.dump(generator.crud_spec, f, indent=4, ensure_ascii=False)

        print("="*30)
        print("¡Compilación Exitosa!")
        print("Archivos generados:")
        print(f"  - {output_html} (¡Ábrelo en tu navegador!)")
        print(f"  - {output_css}")
        print(f"  - {output_json} (Especificación para Unidad 4)")
        print("="*30)

    except Exception as e:
        print("\n" + "="*30)
        print("¡Error durante la compilación!")
        print(e)
        print("="*30)
        # Esto puede ser un error en tu archivo .txt (sintaxis)
        # o un error en el código de Python.

if __name__ == '__main__':
    main(sys.argv)