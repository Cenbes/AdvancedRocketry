package zmaster587.advancedRocketry.integration.nei;

import zmaster587.advancedRocketry.inventory.TextureResources;
import zmaster587.advancedRocketry.tile.multiblock.machine.TileCuttingMachine;
import zmaster587.libVulpes.client.util.ProgressBarImage;

public class CuttingMachineNEI extends TemplateNEI {
	
	@Override
	public String getRecipeName() {
		return "Cutting Machine";
	}

	@Override
	public int recipiesPerPage() {
		return 1;
	}

	@Override
	protected Class getMachine() {
		return TileCuttingMachine.class;
	}

	@Override
	protected ProgressBarImage getProgressBar() {
		return TextureResources.cuttingMachineProgressBar;
	}
}
