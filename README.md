# Gamer Hub MH v0.4 — projeto-fonte

Companheiro de caça para **Monster Hunter Rise + Sunbreak**, com interface em português brasileiro, tema escuro e armazenamento local.

## Recursos presentes no protótipo

- Bestiário inicial com Malzeno, Nargacuga, Zinogre e Rathalos; fichas editáveis.
- Cadastro e gerenciamento de builds pessoais.
- Lista de materiais com quantidades e progresso de coleta.
- Cadastro de receitas e envio de ingredientes para a lista de coleta.
- **Gerador inicial de prioridades de habilidades** por tipo de arma, objetivo e etapa do jogo; é um guia inicial, não um otimizador matemático completo.
- Links para bases de referência em português e para o montador de armaduras GameCat.
- Exportação e importação de backup JSON.
- Dados locais no WebView; o conteúdo pessoal não precisa de conta nem conexão.

## Fontes de referência pesquisadas

- Kiranico em português: https://mhrise.kiranico.com/pt-BR — referência para armas, armaduras, monstros, itens, habilidades, decorações, missões e receitas.
- GameCat: https://gamecat.fun/rise/en/ — referência externa para montagem e comparação de conjuntos.
- MHRice: https://mhrise.mhrice.info/ — referência comunitária com dados estruturados de monstros.
- RiseDex: https://github.com/Syizuril/RiseDex — projeto de código aberto com fraquezas e informações de monstros.
- MHRise-Database: https://github.com/RoboMechE/MHRise-Database — referência comunitária para dados de monstros, armas e hitzones.
- monster-hunter-DB: https://github.com/CrimsonNynja/monster-hunter-DB — banco comunitário com cobertura de vários jogos.

Essas fontes **ainda não foram todas importadas para o aplicativo**. O bestiário local contém exemplos resumidos, e o gerador oferece prioridades gerais. As receitas e peças exatas de equipamento precisam ser integradas e verificadas antes de serem apresentadas como completas. O aplicativo não consulta automaticamente o inventário do jogo.

## Como tentar gerar o APK usando só o celular

O projeto inclui `.github/workflows/build-apk.yml`, para que o GitHub Actions tente compilar o APK na nuvem.

1. Crie uma conta gratuita em https://github.com/signup.
2. No GitHub, crie um repositório novo chamado `gamer-hub-mh`.
3. Envie todos os arquivos e pastas deste ZIP para a raiz do repositório, preservando a pasta `.github/workflows`.
4. Abra a aba **Actions**, selecione **Compilar APK Android** e toque em **Run workflow**. Também pode executar automaticamente quando fizer um envio para a branch `main`.
5. Quando a execução terminar com sucesso, abra a execução e baixe o artefato `gamer-hub-mh-apk`. O APK dentro dele será `app-debug.apk`.

Se a compilação falhar, envie uma captura de tela do erro para podermos corrigir. **O APK ainda não foi compilado nem testado neste pacote.**

## Limitações e próximos passos

- Integrar dados completos e verificados de armas, árvore de melhorias, armaduras, habilidades, decorações, talismãs, materiais, locais e recompensas.
- Fazer as páginas de equipamento abrirem cada material, com quantidade necessária e fonte/local de obtenção verificados.
- Evoluir o gerador para combinar peças, habilidades, slots, decorações e restrições por arma, além de avaliar dano físico/elemental e conforto.
- Testar instalação, navegação, persistência e exportação no aparelho Android.
- Adicionar atribuições e revisar licenças dos dados e imagens antes de redistribuir qualquer conteúdo. Monster Hunter é propriedade intelectual da Capcom; não presumir que imagens ou dados extraídos possam ser redistribuídos livremente.

## Notas técnicas

- Android: Kotlin + Android WebView.
- Interface: HTML, CSS e JavaScript, sem bibliotecas remotas necessárias para a interface principal.
- Armazenamento: `localStorage` do WebView.
- Este pacote é o código-fonte; não é um APK pronto.
