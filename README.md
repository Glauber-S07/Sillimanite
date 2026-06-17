# Sillimanite

Sillimanite is a data processing pipeline designed for efficient data filtering, cleaning, and partitioning. The project leverages multi-threading to optimize high-volume data tasks. - EN.

O Sillimanite é um pipeline de processamento de dados de alta performance, projetado para filtragem, limpeza e particionamento eficiente de grandes volumes de dados. O projeto utiliza multi-threading para otimizar o processamento de tarefas em larga escala. - PT|BR.

Architecture

- Ingestion
- Messagery
- Processing
- Infra (In definition)

Tech Stack

- Language: Java 25

## Getting Started
1. Clone the repository.
2. Ensure you have JDK 25 installed.
3. Run the main class

graph LR
    A[Ingestion] --> B[Messagery]
    B --> C[Processing]
    C --> D[Infra]
