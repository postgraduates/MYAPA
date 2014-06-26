databaseChangeLog = {

	changeSet(author: "Екатерина (generated)", id: "1403717434546-1") {
		createTable(tableName: "person_book") {
			column(name: "person_books_id", type: "bigint")

			column(name: "book_id", type: "bigint")
		}
	}

	changeSet(author: "Екатерина (generated)", id: "1403717434546-2") {
		addForeignKeyConstraint(baseColumnNames: "book_id", baseTableName: "person_book", constraintName: "FK_lxmrhqiauia3fkn181jgt22r6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "book", referencesUniqueColumn: "false")
	}

	changeSet(author: "Екатерина (generated)", id: "1403717434546-3") {
		addForeignKeyConstraint(baseColumnNames: "person_books_id", baseTableName: "person_book", constraintName: "FK_cv9wlvrg9mkqa23hsh0b4qwkv", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "person", referencesUniqueColumn: "false")
	}
}
