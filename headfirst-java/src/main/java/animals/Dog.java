public class Dog extends Canine {

  String name;

  public Dog(String animalName) {
    this.animalName = animalName;
    setAnimalName(this.animalName);
  }

  public String domesticated() {
    return animalAttributeTemplate("domesticated");
  }

  public void isDomesticated() {
    System.out.println(domesticated());
  }

  public void dogSummary() {
    canineSummary();
    isDomesticated();
  }

}
