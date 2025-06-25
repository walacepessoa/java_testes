Projeto em Java com testes
--------------------------

✅ Instalação e configuração do projeto java_testes usando IntelliJ

🧱 Cenário 1: Criar um novo projeto java_testes no IntelliJ
1. Abra o IntelliJ IDEA
Clique em "New Project"

2. Selecione o tipo de projeto
Escolha Java

SDK: selecione o Java 17 ou superior (ou clique em "Add SDK" para instalar)

3. Configure:
Project Name: java_testes

Location: selecione o diretório onde será salvo

4. (Opcional) Se quiser usar Maven:
Marque "Add support for Maven"

Isso criará o arquivo pom.xml automaticamente

5. Clique em Finish
🧱 Cenário 2: Importar um projeto existente no IntelliJ
Se você já tem o projeto salvo no seu computador ou clonado do GitHub:

1. No IntelliJ, vá em:
File > Open → selecione a pasta java_testes

2. Se for Maven ou Gradle:
O IntelliJ detectará o pom.xml ou build.gradle e perguntará se deseja importar:

Clique em Import Maven Project ou Import Gradle Project

▶️ Executar o projeto
Se tiver uma classe com public static void main(String[] args):

Abra o arquivo da classe principal

Clique no botão verde ▶️ ao lado do método main

Escolha Run 'JavaTestes.main()'

🧪 Rodar testes (JUnit)
Se você tiver testes:

Acesse a pasta src/test/java

Clique com o botão direito em um arquivo de teste

Escolha Run 'JavaTestesTest'

🧰 (Opcional) Usando Maven
Se você estiver usando Maven, crie (ou verifique se tem) um arquivo pom.xml semelhante a:
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.seu.pacote</groupId>
  <artifactId>java_testes</artifactId>
  <version>1.0-SNAPSHOT</version>

  <dependencies>
    <!-- Exemplo: JUnit para testes -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.9.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
Depois vá em View > Tool Windows > Maven e clique em Reload All Maven Projects.

🚀 Pronto!
Você agora pode:

Codificar sua lógica em src/main/java

Rodar e depurar diretamente do IntelliJ

Criar testes e executar com facilidade

Adicionar dependências pelo Maven (ou Gradle)

Criado por:
-----------
Walace Pessôa Rio de Janeiro, Brasil V01.01.00
