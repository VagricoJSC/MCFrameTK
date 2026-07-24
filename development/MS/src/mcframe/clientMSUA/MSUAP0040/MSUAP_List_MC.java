package mcframe.clientMSUA.MSUAP0040;

import mcframe.clientCore.event.MCEventInfo;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.MfgInstNoCols;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;

abstract public class MSUAP_List_MC extends MSUAP_List_MC_A {

	// -- ItmDtlMfgLoc:製造場所 (START)
	@Override
	protected void getItmDtlMfgLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlMfgLoc:製造場所 (END)
	// -- ItmDtlSppl:発注先 (START)
	@Override
	protected void getItmDtlSppl_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlSppl:発注先 (END)
	// -- ItmDtlMaker:メーカ (START)
	@Override
	protected void getItmDtlMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlMaker:メーカ (END)
	// -- ItmDtlRqstLoc:依頼先場所 (START)
	@Override
	protected void getItmDtlRqstLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlRqstLoc:依頼先場所 (END)
	// -- MfgInstNo:製造指図ＮＯ (START)
	@Override
	protected void getMfgInstNo_SetViewCols(MCList<MCRow> down, MCEventInfo info) {
		// コンボボックスリストの表示にて日付項目のフォーマットを指定
		super.getMfgInstNo_SetViewCols(down, info);
		mcframe.clientCore.beans.list.MCListColumnInfo i = mcframe.clientCore.beans.list.MCListColumnInfo.create();
		i.putCalendarFormat(MfgInstNoCols.$o_mi_rqst_dlv_rqst_tm, "YMDHM");
		addDefDispColumn(MfgInstNoCols.viewCols(), down, info, i);
	}
	
	// -- MfgInstNo:製造指図ＮＯ (END)
	// -- ItmDtlSub1WithSpplMaker:品目詳細（枝番１、発注先、メーカ） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub1WithSpplMaker_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub1WithSpplMaker_GetList(row, info);
	}
	// -- ItmDtlSub1WithSpplMaker:品目詳細（枝番１、発注先、メーカ） (END)
	// -- ItmDtlSub2WithSpplMaker:品目詳細（枝番２、発注先、メーカ） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub2WithSpplMaker_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub2WithSpplMaker_GetList(row, info);
	}
	// -- ItmDtlSub2WithSpplMaker:品目詳細（枝番２、発注先、メーカ） (END)
	// -- ItmDtlSub3WithSpplMaker:品目詳細（枝番３、発注先、メーカ） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub3WithSpplMaker_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub3WithSpplMaker_GetList(row, info);
	}
	// -- ItmDtlSub3WithSpplMaker:品目詳細（枝番３、発注先、メーカ） (END)
	protected boolean isInput(MCRow row) {
		return row.contains(FXBAC_ListLogicBase.$INPUT_VAL) || row.contains(MAUAC_List.$INPUT_REQ_PLURAL_VAL);
	}
	/**
	 * コンボボックスからの入力かどうかを識別するためのカラムを追加します。
	 */
	protected void setComboIdentifier(MCRow row) {
		row.setBooleanNE(MAUAC_List.$COMBO_MODE, true);
	}

}
