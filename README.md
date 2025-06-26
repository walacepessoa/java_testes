Projeto em Java com testes
--------------------------
<p>
📌 Projeto: java_testes<br/>
Descrição:<br/>
Projeto Java desenvolvido no IntelliJ IDEA com foco em testes unitários utilizando JUnit 5. O objetivo é praticar e demonstrar o uso de testes automatizados para garantir a qualidade do código.<br/>
<br/>
🚀 Tecnologias utilizadas<br/>
<br/>
Java 17+<br/>
IntelliJ IDEA<br/>
JUnit 5<br/>
Maven<br/>
Git<br/>
</p>
✅ Instalação e configuração do projeto java_testes usando IntelliJ<br/>
<br/>
🧱 Cenário 1: Criar um novo projeto java_testes no IntelliJ<br/>
1. Abra o IntelliJ IDEA<br/>
Clique em "New Project"<br/>

2. Selecione o tipo de projeto<br/>
Escolha Java<br/>

SDK: selecione o Java 17 ou superior (ou clique em "Add SDK" para instalar)<br/>

3. Configure:<br/>
Project Name: java_testes<br/>

Location: selecione o diretório onde será salvo<br/>

4. (Opcional) Se quiser usar Maven:<br/>
Marque "Add support for Maven"<br/>

Isso criará o arquivo pom.xml automaticamente<br/>

5. Clique em Finish<br/>
🧱 Cenário 2: Importar um projeto existente no IntelliJ<br/>
Se você já tem o projeto salvo no seu computador ou clonado do GitHub:<br/>

1. No IntelliJ, vá em:<br/>
File > Open → selecione a pasta java_testes<br/>

2. Se for Maven ou Gradle:<br/>
O IntelliJ detectará o pom.xml ou build.gradle e perguntará se deseja importar:<br/>

Clique em Import Maven Project ou Import Gradle Project<br/>

▶️ Executar o projeto<br/>
Se tiver uma classe com public static void main(String[] args):<br/>

Abra o arquivo da classe principal<br/>

Clique no botão verde ▶️ ao lado do método main<br/>

Escolha Run 'JavaTestes.main()'<br/>

🧪 Rodar testes (JUnit)<br/>
Se você tiver testes:<br/>

Acesse a pasta src/test/java<br/>

Clique com o botão direito em um arquivo de teste<br/>

Escolha Run 'JavaTestesTest'<br/>

🧰 Usando Maven<br/>
Se você estiver usando Maven, crie (ou verifique se tem) um arquivo pom.xml semelhante a:<br/>
<project xmlns="http://maven.apache.org/POM/4.0.0" ...><br/>
  <modelVersion>4.0.0</modelVersion><br/>
  <groupId>com.seu.pacote</groupId><br/>
  <artifactId>java_testes</artifactId><br/>
  <version>1.0-SNAPSHOT</version><br/>

  <dependencies><br/>
    <!-- Exemplo: JUnit para testes --><br/>
    <dependency><br/>
      <groupId>org.junit.jupiter</groupId><br/>
      <artifactId>junit-jupiter</artifactId><br/>
      <version>5.9.2</version><br/>
      <scope>test</scope><br/>
    </dependency><br/>
  </dependencies><br/>
</project><br/>
Depois vá em View > Tool Windows > Maven e clique em Reload All Maven Projects.<br/>

🚀 Pronto!<br/>
Você agora pode:<br/>

Codificar sua lógica em src/main/java<br/>

Rodar e depurar diretamente do IntelliJ<br/>

Criar testes e executar com facilidade<br/>

Adicionar dependências pelo Maven (ou Gradle)<br/>
</p>
<p>
📁 Estrutura Completa do Projeto java_testes<br/>

java_testes/<br/>
├── pom.xml<br/>
├── README.md                      # (opcional) Instruções do projeto<br/>
└── src/<br/>
    ├── main/<br/>
    │   └── java/<br/>
    │       └── org/
    │           └── javatestes/<br/>
    │               └── JavaTestes.java       # Classe principal<br/>
    │<br/>
    └── test/<br/>
        └── java/<br/>
            └── org/<br/>
                └── javatestes/<br/>
                    └── JavaTestesTest.java   # Classe de teste unitário<br/>
</p>

Criado por:<br/>
-----------<br/>
Walace Pessôa<br/>
Rio de Janeiro, Brasil<br/>
V01.01.00
