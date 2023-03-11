public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getId() +" "+ user.getFirstName()+" "+user.getLastName()+"Öğrenci Başarıyla Kaydedildi. ");
	}
}
