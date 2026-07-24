package mcframe.clientMAUD.MAUDP1010;

import java.util.Arrays;

import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.notice.MCAppException;

import static mcframe.clientFXUC.FXUCP0010.FXUCP_DataUtil_FW.isNull;
import static mcframe.commonFX.notice.FX_Msg.*;

abstract public class MAUDP_RLBaseCellConfig_MC extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLBaseCellConfig{

	public MAUDP_RLBaseCellConfig_MC(MAUDP_RLBase _panel) {
		super(_panel);
		setPanel(_panel);
	}

	protected IfRLBase _implRLBasePanel;

	/**
	 * @param panel {@link IfRLBase}を実装していること
	 */
	public void setPanel(MAUDP_RLBase panel) {
		super.setPanel(panel);

		_panel = panel;
		if (panel instanceof IfRLBase) {
			_implRLBasePanel = (IfRLBase) panel;
		}
		else {
			throw new MCAppException(FXBAP0075);
		}
	}

	protected boolean isUpdMode() {
		return super.isUpdMode()
				|| panel().getStatus() == _implRLBasePanel.getUPD_ADMINStatus();
	}

	/**
	 * 変更可能なキー項目を返します。
	 */
	protected String[] getUpdatableKeys() {
		return new String[]{"st_dt"};
	}

	/**
	 * データが登録済み、かつ変更不可のキー項目ならtrueを返します。
	 */
	protected boolean isExistingKey(int index, MCColumnConfig column, MCTable table) {
		MCConstRow r = (MCConstRow)table.getBaseTable().getList().get(index);
		if (!isNull(r.getValueNE(_implRLBasePanel.getUpdCntrColumn()))) {
			if (Arrays.asList(getUpdatableKeys()).contains(column.getRowColumnName())) {
				return false;
			}
			return r.getKeys().contains(column.getBaseTableColumnName());
		}
		return false;
	}
}
