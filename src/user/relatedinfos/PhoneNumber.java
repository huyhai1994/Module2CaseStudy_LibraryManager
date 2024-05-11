package user.relatedinfos;

public class PhoneNumber implements UserRelatedInfos {
    @Override
    public void setData(String data) {

    }

    @Override
    public String getData() {
        return "";
    }

    @Override
    public boolean isMatchRegex() {
        return false;
    }
}
