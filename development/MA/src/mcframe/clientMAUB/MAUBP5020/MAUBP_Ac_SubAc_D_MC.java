package mcframe.clientMAUB.MAUBP5020;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Ac_SubAc_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Ac_SubAc_D_MC extends MAUBP_Ac_SubAc_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Ac_SubAc_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Ac_SubAc_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public MCList getAc_SubAc_sub_ac_cd(MCRow row, MCEventInfo info) {
		int i = info.getEventIndex();
		String acCd = getAc_SubAcL().get(i).ac_cd();

		row.addStringColumn(SubAccountCols.$i_ac_cd, acCd);
		return super.getAc_SubAc_sub_ac_cd(row, info);
	}

	@Override
	public void doAc_SubAc_ac_cd_LC(MCEventInfo info) {
		doAcCdLC(info);
	}

	protected void doAcCdLC(MCEventInfo info) {
		int index = info.getEventIndex();
		setValueEx(columnAc_SubAc_sub_ac_cd, index, null);
	}

	/**
	 * 指定されたセルのモードを取得する。<br>
	 * <br>
	 * 部品がモード制御する対象のセルを指定した場合は、
	 * 部品が制御するためのモードを返す。<br>
	 * 部品がモードを制御しないセルを指定した場合は null を返す。
	 *
	 * @param index 処理対象行
	 * @param column テーブルカラム
	 * @return モードまたは null
	 */
	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isDefaultModeEditable(column)) {
			if (column == columnAc_SubAc_sub_ac_cd || column == columnAc_SubAc_sub_ac_nm) {
				String acCd = getAc_SubAcL().get(index).ac_cd();
				boolean subFlg = getAc_SubAcL().get(index).sub_flg();
				if (acCd == null || !subFlg) {
					return MCMode.READ_ONLY;
				}
				if (acCd != null && subFlg) {
					return MCMode.REQUIRED;
				}
			}
		}
		return super.getCellMode(index, column);
	}

}