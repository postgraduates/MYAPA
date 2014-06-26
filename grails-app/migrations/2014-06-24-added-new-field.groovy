databaseChangeLog = {

	changeSet(author: "Екатерина (generated)", id: "1403624911632-1") {
		createTable(tableName: "book") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "bookPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "back_cover", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "publication_date", type: "timestamp") {
				constraints(nullable: "false")
			}
		}
	}
}
