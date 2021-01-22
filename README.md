
Тестовое задание

1) Внутри docker запустить nginx сервис с включенным модулем http_stub_status_module. Сконфигурировать location, возвращающий статус nginx. Должно быть похоже на:
$ curl http://{nginx_host}/{configured_location}
Active connections: 2
server accepts handled requests
 841845 841845 1631067
Reading: 0 Writing: 1 Waiting: 1

2) Необходимо реализовать проксирующий api-service на java, содержащий эндпоинт GET /nginx/statistics делающий запрос к nginx (http://{nginx_host}/{configured_location}), возвращающий статистику в виде json:
{
 "activeConnections": 2,
 "requests": {
   "accepts": 841845,
   "handled": 841845,
   "requests": 1631067
 }
}
Покрыть тестами логику, преобразующую nginx формат в json

Требования к выполненному тестовому заданию:
1) выполненное тестовое задание должно быть размещено на gitlab
2) приложение (в том числе собранный nginx) должно запускаться на докере (требуется написать Dockerfile и docker-compose.yml)
3) Пайплайн на gitlab должен запускать тесты на api proxy service, собирать и пушить docker image. 

Рекомендуемый стек:
1) java 11(14)
2) spring boot 2
3) nginx
3) gradle
