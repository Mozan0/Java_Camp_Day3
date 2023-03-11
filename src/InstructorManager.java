public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getId() +" "+ user.getFirstName()+" "+user.getLastName()+"Eğitmen Başarıyla Kaydedildi. ");
	}
}
