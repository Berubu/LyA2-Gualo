# Generated from WebGen.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .WebGenParser import WebGenParser
else:
    from WebGenParser import WebGenParser

# This class defines a complete generic visitor for a parse tree produced by WebGenParser.

class WebGenVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by WebGenParser#pagina.
    def visitPagina(self, ctx:WebGenParser.PaginaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#elemento.
    def visitElemento(self, ctx:WebGenParser.ElementoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#linea.
    def visitLinea(self, ctx:WebGenParser.LineaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#titulo.
    def visitTitulo(self, ctx:WebGenParser.TituloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#menu.
    def visitMenu(self, ctx:WebGenParser.MenuContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#seccionImagenes.
    def visitSeccionImagenes(self, ctx:WebGenParser.SeccionImagenesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#texto.
    def visitTexto(self, ctx:WebGenParser.TextoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#seccionAcercade.
    def visitSeccionAcercade(self, ctx:WebGenParser.SeccionAcercadeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#propiedad.
    def visitPropiedad(self, ctx:WebGenParser.PropiedadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#crud.
    def visitCrud(self, ctx:WebGenParser.CrudContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#bdd.
    def visitBdd(self, ctx:WebGenParser.BddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#tabla.
    def visitTabla(self, ctx:WebGenParser.TablaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by WebGenParser#campo.
    def visitCampo(self, ctx:WebGenParser.CampoContext):
        return self.visitChildren(ctx)



del WebGenParser