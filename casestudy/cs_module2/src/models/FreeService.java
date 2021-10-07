package casestudy.src.models;

public class FreeService {
    private String idFreeService;
    private String nameFreeService;

    public FreeService() {
    }


    public FreeService(String idFreeService, String nameFreeService) {
        this.idFreeService = idFreeService;
        this.nameFreeService = nameFreeService;
    }


    public String getIdFreeService() {
        return idFreeService;
    }

    public void setIdFreeService(String idFreeService) {
        this.idFreeService = idFreeService;
    }

    public String getNameFreeService() {
        return nameFreeService;
    }

    public void setNameFreeService(String nameFreeService) {
        this.nameFreeService = nameFreeService;
    }

    @Override
    public String toString() {
        return "FreeService{" +
                "idFreeService='" + idFreeService + '\'' +
                ", nameFreeService='" + nameFreeService + '\'' +
                '}';
    }
}
