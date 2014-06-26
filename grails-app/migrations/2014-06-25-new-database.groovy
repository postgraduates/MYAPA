databaseChangeLog = {

	changeSet(author: "Екатерина (generated)", id: "1403715824752-1") {
		createTable(tableName: "person") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "personPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "lastname", type: "varchar(255)") {
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
