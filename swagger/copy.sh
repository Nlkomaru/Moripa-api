rm -r ../docs/docs/swagger
cp -f  -r ../openapi ../docs/docs/swagger
cd ../docs/
mkdocs serve