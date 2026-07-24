package mcframe.clientMAUD.MAUDP0030;

import java.util.Arrays;
import java.util.List;

import mcframe.clientFXBA.FXBAP0070.FXBAP_RLCellConfig;
import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.notice.MCAppException;
import static mcframe.commonFX.notice.FX_Msg.*;

abstract public class MAUDP_RLBaseCellConfig_MC extends FXBAP_RLCellConfig {

	public MAUDP_RLBaseCellConfig_MC(MAUDP_RLBase _panel) {
		super();
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
	
	@Override
	public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
		if (table.getBaseTable() == _implRLBasePanel.getDtlTable()) {
			// UPDStatus時、登録済みレコードのキー項目は変更不可
			if (isUpdMode()) {
				if (isDtlKey(column)) {
					// 変更可能なキー項目ならばREAD ONLYにしない。
					if (!Arrays.asList(getUpdatableKeys())
							.contains(column.getRowColumnName())) {
						MCConstRow r = table.getBaseTable().getRow(index);
						if (r.getValueNE(_implRLBasePanel.getUpdCntrColumn()) != null) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
		}
		return super.getPriorMode(index, column, table);
	}

	protected boolean isUpdMode() {
		return panel().getStatus() == _implRLBasePanel.getUPDStatus();
	}

	/**
	 * columnがDtlのキー項目か判定<br>
	 * 
	 * @param column カラムコンフィグ
	 * @return キー項目ならtrue
	 */
	protected boolean isDtlKey(MCColumnConfig column) {
		return getDtlKeyCols().contains(column.getBaseRowColumnName());
	}

	protected List<String> _dtlKeyCols;

	/**
	 * Dtlのキー項目を返す<br>
	 * 
	 * @return Dtlのキー項目のリスト
	 */
	protected List<String> getDtlKeyCols() {
		if (_dtlKeyCols == null) {
			_dtlKeyCols = Arrays.asList(_implRLBasePanel.getDtlRKeyColumns());
		}
		return _dtlKeyCols;
	}

	/**
	 * 変更可能なキー項目を返します。
	 */
	protected String[] getUpdatableKeys() {
		return new String[]{};
	}

}

