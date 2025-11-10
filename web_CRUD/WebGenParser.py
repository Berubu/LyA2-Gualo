# Generated from WebGen.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,19,98,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,1,0,
        4,0,29,8,0,11,0,12,0,30,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        3,1,43,8,1,1,2,1,2,1,3,1,3,1,3,1,4,1,4,1,5,1,5,4,5,54,8,5,11,5,12,
        5,55,1,5,4,5,59,8,5,11,5,12,5,60,3,5,63,8,5,1,6,1,6,1,6,1,7,1,7,
        4,7,70,8,7,11,7,12,7,71,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,10,
        1,10,1,10,1,11,1,11,1,11,4,11,89,8,11,11,11,12,11,90,1,11,1,11,1,
        12,1,12,1,12,1,12,0,0,13,0,2,4,6,8,10,12,14,16,18,20,22,24,0,0,96,
        0,26,1,0,0,0,2,42,1,0,0,0,4,44,1,0,0,0,6,46,1,0,0,0,8,49,1,0,0,0,
        10,51,1,0,0,0,12,64,1,0,0,0,14,67,1,0,0,0,16,73,1,0,0,0,18,77,1,
        0,0,0,20,82,1,0,0,0,22,85,1,0,0,0,24,94,1,0,0,0,26,28,5,2,0,0,27,
        29,3,2,1,0,28,27,1,0,0,0,29,30,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,
        0,31,32,1,0,0,0,32,33,5,3,0,0,33,34,5,0,0,1,34,1,1,0,0,0,35,43,3,
        4,2,0,36,43,3,6,3,0,37,43,3,8,4,0,38,43,3,10,5,0,39,43,3,12,6,0,
        40,43,3,18,9,0,41,43,3,14,7,0,42,35,1,0,0,0,42,36,1,0,0,0,42,37,
        1,0,0,0,42,38,1,0,0,0,42,39,1,0,0,0,42,40,1,0,0,0,42,41,1,0,0,0,
        43,3,1,0,0,0,44,45,5,4,0,0,45,5,1,0,0,0,46,47,5,5,0,0,47,48,5,16,
        0,0,48,7,1,0,0,0,49,50,5,6,0,0,50,9,1,0,0,0,51,62,5,7,0,0,52,54,
        5,16,0,0,53,52,1,0,0,0,54,55,1,0,0,0,55,53,1,0,0,0,55,56,1,0,0,0,
        56,63,1,0,0,0,57,59,5,17,0,0,58,57,1,0,0,0,59,60,1,0,0,0,60,58,1,
        0,0,0,60,61,1,0,0,0,61,63,1,0,0,0,62,53,1,0,0,0,62,58,1,0,0,0,63,
        11,1,0,0,0,64,65,5,8,0,0,65,66,5,16,0,0,66,13,1,0,0,0,67,69,5,15,
        0,0,68,70,3,16,8,0,69,68,1,0,0,0,70,71,1,0,0,0,71,69,1,0,0,0,71,
        72,1,0,0,0,72,15,1,0,0,0,73,74,5,18,0,0,74,75,5,1,0,0,75,76,5,16,
        0,0,76,17,1,0,0,0,77,78,5,9,0,0,78,79,3,20,10,0,79,80,3,22,11,0,
        80,81,5,10,0,0,81,19,1,0,0,0,82,83,5,11,0,0,83,84,5,18,0,0,84,21,
        1,0,0,0,85,86,5,12,0,0,86,88,5,18,0,0,87,89,3,24,12,0,88,87,1,0,
        0,0,89,90,1,0,0,0,90,88,1,0,0,0,90,91,1,0,0,0,91,92,1,0,0,0,92,93,
        5,14,0,0,93,23,1,0,0,0,94,95,5,13,0,0,95,96,5,18,0,0,96,25,1,0,0,
        0,7,30,42,55,60,62,71,90
    ]

class WebGenParser ( Parser ):

    grammarFileName = "WebGen.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "':'", "'Inicio pagina'", "'fin pagina'", 
                     "'linea simple'", "'titulo'", "'menu opciones'", "'seccion imagenes'", 
                     "'texto'", "'crud inicio'", "'crud fin'", "'bdd'", 
                     "'tabla'", "'campo'", "'fintabla'", "'seccion acercade'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "INICIO_PAGINA", "FIN_PAGINA", 
                      "LINEA_SIMPLE", "TITULO", "MENU_OPCIONES", "SECCION_IMAGENES", 
                      "TEXTO", "CRUD_INICIO", "CRUD_FIN", "BDD", "TABLA", 
                      "CAMPO", "FIN_TABLA", "SECCION_ACERCADE", "STRING", 
                      "FILENAME", "ID", "WHITESPACE" ]

    RULE_pagina = 0
    RULE_elemento = 1
    RULE_linea = 2
    RULE_titulo = 3
    RULE_menu = 4
    RULE_seccionImagenes = 5
    RULE_texto = 6
    RULE_seccionAcercade = 7
    RULE_propiedad = 8
    RULE_crud = 9
    RULE_bdd = 10
    RULE_tabla = 11
    RULE_campo = 12

    ruleNames =  [ "pagina", "elemento", "linea", "titulo", "menu", "seccionImagenes", 
                   "texto", "seccionAcercade", "propiedad", "crud", "bdd", 
                   "tabla", "campo" ]

    EOF = Token.EOF
    T__0=1
    INICIO_PAGINA=2
    FIN_PAGINA=3
    LINEA_SIMPLE=4
    TITULO=5
    MENU_OPCIONES=6
    SECCION_IMAGENES=7
    TEXTO=8
    CRUD_INICIO=9
    CRUD_FIN=10
    BDD=11
    TABLA=12
    CAMPO=13
    FIN_TABLA=14
    SECCION_ACERCADE=15
    STRING=16
    FILENAME=17
    ID=18
    WHITESPACE=19

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class PaginaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INICIO_PAGINA(self):
            return self.getToken(WebGenParser.INICIO_PAGINA, 0)

        def FIN_PAGINA(self):
            return self.getToken(WebGenParser.FIN_PAGINA, 0)

        def EOF(self):
            return self.getToken(WebGenParser.EOF, 0)

        def elemento(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(WebGenParser.ElementoContext)
            else:
                return self.getTypedRuleContext(WebGenParser.ElementoContext,i)


        def getRuleIndex(self):
            return WebGenParser.RULE_pagina

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPagina" ):
                listener.enterPagina(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPagina" ):
                listener.exitPagina(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPagina" ):
                return visitor.visitPagina(self)
            else:
                return visitor.visitChildren(self)




    def pagina(self):

        localctx = WebGenParser.PaginaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_pagina)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(WebGenParser.INICIO_PAGINA)
            self.state = 28 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 27
                self.elemento()
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 33776) != 0)):
                    break

            self.state = 32
            self.match(WebGenParser.FIN_PAGINA)
            self.state = 33
            self.match(WebGenParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def linea(self):
            return self.getTypedRuleContext(WebGenParser.LineaContext,0)


        def titulo(self):
            return self.getTypedRuleContext(WebGenParser.TituloContext,0)


        def menu(self):
            return self.getTypedRuleContext(WebGenParser.MenuContext,0)


        def seccionImagenes(self):
            return self.getTypedRuleContext(WebGenParser.SeccionImagenesContext,0)


        def texto(self):
            return self.getTypedRuleContext(WebGenParser.TextoContext,0)


        def crud(self):
            return self.getTypedRuleContext(WebGenParser.CrudContext,0)


        def seccionAcercade(self):
            return self.getTypedRuleContext(WebGenParser.SeccionAcercadeContext,0)


        def getRuleIndex(self):
            return WebGenParser.RULE_elemento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElemento" ):
                listener.enterElemento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElemento" ):
                listener.exitElemento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElemento" ):
                return visitor.visitElemento(self)
            else:
                return visitor.visitChildren(self)




    def elemento(self):

        localctx = WebGenParser.ElementoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_elemento)
        try:
            self.state = 42
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 35
                self.linea()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 36
                self.titulo()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 3)
                self.state = 37
                self.menu()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 38
                self.seccionImagenes()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 5)
                self.state = 39
                self.texto()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 6)
                self.state = 40
                self.crud()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 7)
                self.state = 41
                self.seccionAcercade()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LineaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LINEA_SIMPLE(self):
            return self.getToken(WebGenParser.LINEA_SIMPLE, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_linea

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLinea" ):
                listener.enterLinea(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLinea" ):
                listener.exitLinea(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLinea" ):
                return visitor.visitLinea(self)
            else:
                return visitor.visitChildren(self)




    def linea(self):

        localctx = WebGenParser.LineaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_linea)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(WebGenParser.LINEA_SIMPLE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TituloContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TITULO(self):
            return self.getToken(WebGenParser.TITULO, 0)

        def STRING(self):
            return self.getToken(WebGenParser.STRING, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_titulo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTitulo" ):
                listener.enterTitulo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTitulo" ):
                listener.exitTitulo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTitulo" ):
                return visitor.visitTitulo(self)
            else:
                return visitor.visitChildren(self)




    def titulo(self):

        localctx = WebGenParser.TituloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_titulo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46
            self.match(WebGenParser.TITULO)
            self.state = 47
            self.match(WebGenParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MenuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MENU_OPCIONES(self):
            return self.getToken(WebGenParser.MENU_OPCIONES, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_menu

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMenu" ):
                listener.enterMenu(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMenu" ):
                listener.exitMenu(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMenu" ):
                return visitor.visitMenu(self)
            else:
                return visitor.visitChildren(self)




    def menu(self):

        localctx = WebGenParser.MenuContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_menu)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(WebGenParser.MENU_OPCIONES)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SeccionImagenesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SECCION_IMAGENES(self):
            return self.getToken(WebGenParser.SECCION_IMAGENES, 0)

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(WebGenParser.STRING)
            else:
                return self.getToken(WebGenParser.STRING, i)

        def FILENAME(self, i:int=None):
            if i is None:
                return self.getTokens(WebGenParser.FILENAME)
            else:
                return self.getToken(WebGenParser.FILENAME, i)

        def getRuleIndex(self):
            return WebGenParser.RULE_seccionImagenes

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeccionImagenes" ):
                listener.enterSeccionImagenes(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeccionImagenes" ):
                listener.exitSeccionImagenes(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSeccionImagenes" ):
                return visitor.visitSeccionImagenes(self)
            else:
                return visitor.visitChildren(self)




    def seccionImagenes(self):

        localctx = WebGenParser.SeccionImagenesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_seccionImagenes)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(WebGenParser.SECCION_IMAGENES)
            self.state = 62
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.state = 53 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 52
                    self.match(WebGenParser.STRING)
                    self.state = 55 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==16):
                        break

                pass
            elif token in [17]:
                self.state = 58 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 57
                    self.match(WebGenParser.FILENAME)
                    self.state = 60 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==17):
                        break

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TextoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TEXTO(self):
            return self.getToken(WebGenParser.TEXTO, 0)

        def STRING(self):
            return self.getToken(WebGenParser.STRING, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_texto

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTexto" ):
                listener.enterTexto(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTexto" ):
                listener.exitTexto(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTexto" ):
                return visitor.visitTexto(self)
            else:
                return visitor.visitChildren(self)




    def texto(self):

        localctx = WebGenParser.TextoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_texto)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(WebGenParser.TEXTO)
            self.state = 65
            self.match(WebGenParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SeccionAcercadeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SECCION_ACERCADE(self):
            return self.getToken(WebGenParser.SECCION_ACERCADE, 0)

        def propiedad(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(WebGenParser.PropiedadContext)
            else:
                return self.getTypedRuleContext(WebGenParser.PropiedadContext,i)


        def getRuleIndex(self):
            return WebGenParser.RULE_seccionAcercade

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeccionAcercade" ):
                listener.enterSeccionAcercade(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeccionAcercade" ):
                listener.exitSeccionAcercade(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSeccionAcercade" ):
                return visitor.visitSeccionAcercade(self)
            else:
                return visitor.visitChildren(self)




    def seccionAcercade(self):

        localctx = WebGenParser.SeccionAcercadeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_seccionAcercade)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(WebGenParser.SECCION_ACERCADE)
            self.state = 69 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 68
                self.propiedad()
                self.state = 71 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==18):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PropiedadContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(WebGenParser.ID, 0)

        def STRING(self):
            return self.getToken(WebGenParser.STRING, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_propiedad

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPropiedad" ):
                listener.enterPropiedad(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPropiedad" ):
                listener.exitPropiedad(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPropiedad" ):
                return visitor.visitPropiedad(self)
            else:
                return visitor.visitChildren(self)




    def propiedad(self):

        localctx = WebGenParser.PropiedadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_propiedad)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(WebGenParser.ID)
            self.state = 74
            self.match(WebGenParser.T__0)
            self.state = 75
            self.match(WebGenParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CrudContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CRUD_INICIO(self):
            return self.getToken(WebGenParser.CRUD_INICIO, 0)

        def bdd(self):
            return self.getTypedRuleContext(WebGenParser.BddContext,0)


        def tabla(self):
            return self.getTypedRuleContext(WebGenParser.TablaContext,0)


        def CRUD_FIN(self):
            return self.getToken(WebGenParser.CRUD_FIN, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_crud

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCrud" ):
                listener.enterCrud(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCrud" ):
                listener.exitCrud(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrud" ):
                return visitor.visitCrud(self)
            else:
                return visitor.visitChildren(self)




    def crud(self):

        localctx = WebGenParser.CrudContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_crud)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self.match(WebGenParser.CRUD_INICIO)
            self.state = 78
            self.bdd()
            self.state = 79
            self.tabla()
            self.state = 80
            self.match(WebGenParser.CRUD_FIN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BddContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BDD(self):
            return self.getToken(WebGenParser.BDD, 0)

        def ID(self):
            return self.getToken(WebGenParser.ID, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_bdd

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBdd" ):
                listener.enterBdd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBdd" ):
                listener.exitBdd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBdd" ):
                return visitor.visitBdd(self)
            else:
                return visitor.visitChildren(self)




    def bdd(self):

        localctx = WebGenParser.BddContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_bdd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(WebGenParser.BDD)
            self.state = 83
            self.match(WebGenParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TABLA(self):
            return self.getToken(WebGenParser.TABLA, 0)

        def ID(self):
            return self.getToken(WebGenParser.ID, 0)

        def FIN_TABLA(self):
            return self.getToken(WebGenParser.FIN_TABLA, 0)

        def campo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(WebGenParser.CampoContext)
            else:
                return self.getTypedRuleContext(WebGenParser.CampoContext,i)


        def getRuleIndex(self):
            return WebGenParser.RULE_tabla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTabla" ):
                listener.enterTabla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTabla" ):
                listener.exitTabla(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTabla" ):
                return visitor.visitTabla(self)
            else:
                return visitor.visitChildren(self)




    def tabla(self):

        localctx = WebGenParser.TablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_tabla)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.match(WebGenParser.TABLA)
            self.state = 86
            self.match(WebGenParser.ID)
            self.state = 88 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 87
                self.campo()
                self.state = 90 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==13):
                    break

            self.state = 92
            self.match(WebGenParser.FIN_TABLA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CampoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CAMPO(self):
            return self.getToken(WebGenParser.CAMPO, 0)

        def ID(self):
            return self.getToken(WebGenParser.ID, 0)

        def getRuleIndex(self):
            return WebGenParser.RULE_campo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCampo" ):
                listener.enterCampo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCampo" ):
                listener.exitCampo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCampo" ):
                return visitor.visitCampo(self)
            else:
                return visitor.visitChildren(self)




    def campo(self):

        localctx = WebGenParser.CampoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_campo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self.match(WebGenParser.CAMPO)
            self.state = 95
            self.match(WebGenParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





