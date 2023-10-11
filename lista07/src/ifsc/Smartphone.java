package ifsc;

public class Smartphone extends Produto {
	private String dimensoestela;
	private Integer numCameras;

	public Integer getNumCameras() {
		return numCameras;
	}

	public void setNumCameras(Integer numCameras) {
		this.numCameras = numCameras;
	}

	public String getDimensoestela() {
		return dimensoestela;
	}

	public void setDimensoestela(String dimensoestela) {
		this.dimensoestela = dimensoestela;
	}

}
