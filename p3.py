import sys

def display_menu():
    print("\n--- Contact Manager ---")
    print("1. Add Contact")
    print("2. View All Contacts")
    print("3. Search Contact")
    print("4. Exit")

def main():
    # Dictionary to store contacts (Key: Name, Value: Phone)
    contacts = {}

    while True:
        display_menu()
        choice = input("Select an option (1-4): ")

        if choice == '1':
            name = input("Enter name: ").strip()
            phone = input("Enter phone number: ").strip()
            contacts[name] = phone
            print(f"Contact for {name} saved!")

        elif choice == '2':
            print("\n--- All Contacts ---")
            if not contacts:
                print("No contacts found.")
            else:
                for name, phone in contacts.items():
                    print(f"Name: {name} | Phone: {phone}")

        elif choice == '3':
            search_name = input("Enter name to search: ").strip()
            # .get() is safer than contacts[search_name] because it won't crash if not found
            result = contacts.get(search_name, "Contact not found.")
            print(f"Result: {result}")

        elif choice == '4':
            print("Exiting program. Goodbye!")
            sys.exit()

        else:
            print("Invalid choice, please try again.")

if __name__ == "__main__":
    main()