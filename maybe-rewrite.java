int choice = maybeService.get("label");
switch (choice) {
    case 0:
        // do something 0
        break;
    case 1:
        // do something 1
        break;
    case 2:
        // do something 2
        break;
    default:
        maybeService.log("get invalid choice for " + choice + " label");
        break;
}
