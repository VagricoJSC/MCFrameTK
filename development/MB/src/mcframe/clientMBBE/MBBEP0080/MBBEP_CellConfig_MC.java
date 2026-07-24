package mcframe.clientMBBE.MBBEP0080;

import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.*;
import static mcframe.clientFXUC.FXUCP0010.FXUCP_DataUtil.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.commonCore.meta.MCMeta;

public class MBBEP_CellConfig_MC extends mcframe.clientFXBA.FXBAP0140.FXBAP0140CellConfig {

	protected List<String> _colsInsEnable = new ArrayList<String>();

	protected List<String> _colsInsRequired = new ArrayList<String>();

	protected List<String> _colsInsReadonly = new ArrayList<String>();

	protected static final String EXE_STS_TYP = "exe_sts_typ";

	protected static final String SDRV_STS_TYP = "sdrv_sts_typ";
	protected static final String CHECK = "check";
	protected static final String IMP_FLG = "imp_flg";
	public void setResInfo(String[] colsInsEnable, String[] colsInsRequired,
			String[] colsInsReadonly) {

		if (colsInsEnable != null) {
			for (String col : colsInsEnable) {
				this._colsInsEnable.add(col);
			}
		}

		if (colsInsRequired != null) {
			for (String col : colsInsRequired) {
				this._colsInsRequired.add(col);
			}
		}

		if (colsInsReadonly != null) {
			for (String col : colsInsReadonly) {
				this._colsInsReadonly.add(col);
			}
		}
	}

	@Override
	public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

		MCRow row = table.getRow(index);
		String name = column.getMeta().name();
		if (row.isStatusCreate() || row.isStatusGUICreate()) {
			if (_colsInsEnable.contains(name)) {
				return MCMode.ENABLE;
			}
			if (_colsInsRequired.contains(name)) {
				return MCMode.REQUIRED;
			}
			if (_colsInsReadonly.contains(name)) {
				return MCMode.READ_ONLY;
			}
			if (isSame(name, CHECK)) {
				return MCMode.READ_ONLY;
			}
		}
		else {
			if (MAC_EXE_STS_TYP.isOK(row.getStringNE(EXE_STS_TYP))
				|| MAC_EXE_STS_TYP.isSKP(row.getStringNE(EXE_STS_TYP))) {
				return MCMode.READ_ONLY;
			}
			else if (MAC_EXE_STS_TYP.isNOT_EXE(row.getStringNE(EXE_STS_TYP))) {
				if (MAC_SDRV_STS_TYP.isRECV_CONV_ERR(row.getStringNE(SDRV_STS_TYP))) {
					return MCMode.READ_ONLY;
				}
			}
			if (isSame(name, CHECK)) {
			 	if (!row.getBooleanNE(IMP_FLG)) {
					return MCMode.READ_ONLY;
			  	}
			}
		}

		return super.getPriorMode(index, column, table);
	}

	@Override
	public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
		MCRow row = table.getRow(index);
		String colNm = column.getRowColumnName();
		MCMeta meta = column.getMeta();
		if (meta.length() > 0 && !isNull(row.getValue(colNm))) {
			String val = row.getValue(colNm).toString();
			if (val.length() > meta.length()) {
				return val.length();
			}
		}
		return meta.length();
	}
}
