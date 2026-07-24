package mcframe.clientMAUD.MAUDP1020;

import java.util.Arrays;
import java.util.List;

import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.notice.MCAppException;
import static mcframe.commonFX.notice.FX_Msg.*;

abstract public class MAUDP_LCLRLBaseCellConfig_MC extends
		mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig {

	public MAUDP_LCLRLBaseCellConfig_MC(MAUDP_LCLRLBase _panel) {
		super(_panel);
		setPanel(_panel);
	}

	protected IfLCLRLBase _implRLBasePanel;

	/**
	 * @param panel {@link IfRLBase}を実装していること
	 */
	public void setPanel(MAUDP_LCLRLBase panel) {
		_panel = panel;
		if (panel instanceof IfLCLRLBase) {
			_implRLBasePanel = (IfLCLRLBase) panel;
		}
		else {
			throw new MCAppException(FXBAP0075);
		}
	}

	@Override
	public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
		if (table.getBaseTable() == _implRLBasePanel.getLclTable()) {
			// UPDStatus時、登録済みレコードのキー項目は変更不可
			if (isUpdMode()) {
				if (isLclKey(column)) {
					MCConstRow r = table.getBaseTable().getRow(index);
					if (r.getValueNE(_implRLBasePanel.getUpdCntrColumn()) != null) {
						return MCMode.READ_ONLY;
					}
				}
			}
		}
		return super.getPriorMode(index, column, table);
	}

	/**
	 * columnがLclのキー項目か判定<br>
	 * 
	 * @param column カラムコンフィグ
	 * @return キー項目ならtrue
	 */
	protected boolean isLclKey(MCColumnConfig column) {
		return getLclKeyCols().contains(column.getBaseRowColumnName());
	}

	protected List<String> _lclKeyCols;

	/**
	 * Lclのキー項目を返す<br>
	 * 
	 * @return Lclのキー項目のリスト
	 */
	protected List<String> getLclKeyCols() {
		if (_lclKeyCols == null) {
			_lclKeyCols = Arrays.asList(_implRLBasePanel.getLclRKeyColumns());
		}
		return _lclKeyCols;
	}

}
