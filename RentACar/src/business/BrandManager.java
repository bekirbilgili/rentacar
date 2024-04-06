package business;

import core.Helper;
import dao.BrandDao;
import entity.Brand;

import java.util.ArrayList;

public class BrandManager {

    private final BrandDao brandDao;

    public BrandManager() {
        this.brandDao = new BrandDao();
    }

    public ArrayList<Object[]> getForTable(int size) {
        ArrayList<Object[]> brandRowList = new ArrayList<>();
        for (Brand brand : this.findAll()) {
            Object[] rowObject = new Object[size];
            int i = 0;
            rowObject[i++] = brand.getId();
            rowObject[i++] = brand.getName();
            brandRowList.add(rowObject);
        }
        return brandRowList;
    }

    public ArrayList<Brand> findAll() {
        return this.brandDao.findAll();
    }

    public boolean save(Brand brand) {
        if (brand.getId() != 0) {
            Helper.showMsg("error");
        }
        return this.brandDao.save(brand);
    }

    public Brand getbyId(int id) {
        return this.brandDao.getbyId(id);
    }

    public boolean update(Brand brand) {
        if (this.getbyId(brand.getId()) == null) {
            Helper.showMsg("notFound");
        }

        return this.brandDao.update(brand);
    }

    public boolean delete (int id) {
        if (this.getbyId(id)==null) {
            Helper.showMsg(id+"ID kayıtlı marka bulunamadı");
        }

        return this.brandDao.delete(id);
    }
}
