# Como instalar e executar o docker

Bom, para ter o docker você pode seguir o tutorial, mas se quiser o docker 
desktop (interface), por exemplo, o melhor é seguir as documentações.

## Intalação no Windows

Para windows, na verdade, o processo bem mais complicado, primeiro você vai precisar do wsl
(Subsistema Linux para windows). Então eu recomendo você seguir a documentação se quiser melhores 
detalhes, mas basicamente o WSL, como o nome já diz seria um linux por baixo dos panos que vai 
executar em paralelo com o windows, ele é necessário, pois o docker para executar precisa de alguns
recursos linux.

Mas vamos lá, primeiro você abre o powershell em modo administrador e executa o seguinte comando
abaixo para habilitar as configurações necessárias para ter o wsl em sua máquina, ele também vai 
instalar o Ubuntu como distro linux, mas depois você pode alterar isso.

```
wsl --install
```
Talvez o wsl não instale de cara, e nisso você talvez precise executar o seguinte 
comando para ver as distros disponiveis.
```
wsl --list --online
```
Após escolher a distro que você quer, execute o seguinte comando e a instalação deve ocorrer de boa
```
wsl --install -d <DistroName>
```
Após isso, acredito que a instalação ocorrerá normalmente e você deverá fazer a configuração
do seu usuário linux normalmente, eu sugiro que seja o mesmo do windows para não precisar 
lembrar de outra senha e usuário.

Após isso você pode conferir se o wsl está funcionando com o seguinte comando:
```
wsl -l -v
```
Após saber a versão, se quiser pode alterar a versão do wsl para o 1 ou o 2, eu sugiro que
use o 2, pois ele é mais completo.
```
wsl --set-default-version <Version#>
```

E um ponto adicional é que você pode alterar a distribuição linux, para isso use o seguinte comando:
```
wsl --setdefault <DistributionName>
```

Após a instalação do wsl você pode ou seguir a instalação de docker para linux via terminal wsl, 
ou pode seguir a documentação e instalar o docker desktop, sendo uma interface para o docker, não
te o brigando a fazer tudo por terminal, mas eu recomendo, pois, assim você tem um melhor aprendizado,
fora que sabera cada coisa que está acontecendo. 

> https://docs.docker.com/desktop/install/windows-install/

## Intalação no Linux
> https://docs.docker.com/desktop/install/linux-install/

No Linux, na verdade, a instalação do docker é bem simples, basta abrir o terminal
e seguir a lista de comandos, irei explicar o que cada um deles faz:

Lembrando que, eu usei como base o ubunto para essa documentação, qualquer versão 
diferente de linux que tenha gerenciadores de pacotes diferentes podem precisar 
de um processo diferente.

O comando abaixo remove qualquer "resquicio de docker" que você tiver na sua máquina
que o impede de instalar a versão mais atual.
```
$ sudo apt-get remove docker docker-engine docker.io
```
O comando abaixo é para você atualizar o seu gerenciador de pacotes.
```
$ sudo apt-get update
```
Agora esse comando abaixo vai finalmente instalar o docker na sua máquina, provavelmente
vai aparecer uma pergunta no terminal com y/n? Digite Y para seguir a instalação.
```
$ sudo apt install docker.io
```
Então execute o comando abaixo para instalar todas as dependencias do docker necessárias,
como docker-compose que será necessário para o próximo tutorial.
```
sudo snap install docker
``` 
Após isso você pode fechar o terminal e abrir outro, e após executar *docker ps* deve aparecer 
a seguinte imagem no terminal.

![exemplo docker ps](image/exemploDockerPs.png)