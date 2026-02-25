# 🏃 Carrera de Atletas

Simulación de una carrera en pista desarrollada en Java.

## 📋 Descripción
- Pista de longitud fija representada con guiones bajos (_)
- Cada atleta avanza según sus sprints por tick
- Los sprints se repiten en ciclo continuo hasta que alguien gana
- Gana el primero en llegar a la meta

## 🏁 Atletas
- **ECU**: sprints [2, 1, 3, 0, 2] (se repiten)
- **PER**: sprints [1, 2, 2, 2, 2] (se repiten)

## 🖥️ Ejemplo de salida

--- TICK 1 ---
ECU | ECU___________
PER | PER_________

--- TICK 7 ---
ECU | __________ECU (FIN)
PER | __________PER (FIN)

RESULTADO: EMPATE entre ECU y PER

========================

## 🚀 Cómo ejecutar
1. Abrir en NetBeans
2. Ejecutar con F6

## 📁 Archivos principales
- `CarreraAtletas.java` - Clase principal
- `Atleta.java` - Clase que representa cada corredor

## 👨‍💻 Autor
Jay Villarreal Barcos - Prueba técnica Java
