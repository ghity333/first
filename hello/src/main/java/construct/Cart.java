package construct;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:15
 * construct
 * jack
 */
public class Cart {
    private UserDao userDao;

    public Cart(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
