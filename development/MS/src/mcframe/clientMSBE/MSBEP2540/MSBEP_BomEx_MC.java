package mcframe.clientMSBE.MSBEP2540;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5210.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMSBE.MSBEP2520.DtlGiR;
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_BomEx"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_BomEx_MC extends MSBEP_BomEx_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	// 呼び出し元の画面(MSBE2520)インスタンス
	MSBEP_StkXfrActReg _msbe2520;

	/*
	 *  検索後に展開処理を行うか否かを制御するFLG
	 *  ①検索処理前に本FLGを更新
	 *  ②"show"メソッドで本FLGを見て展開処理を実施
	 *  　　※ TRUEとなっている場合に展開します。
	 */
	Boolean _is_expand_all = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_BomEx_MC() {
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
	public MSBEP_BomEx_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2540_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2540_Srch01Caller<P extends MSBEP_BomEx, B extends MS_MSBEL2540_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2540_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			if(_is_expand_all){
				Rslt_hrrchy_p_PPanel.showExpandAll(getRsltL());
			}
			else{
				Rslt_hrrchy_p_PPanel.showCollapseAll(getRsltL());
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setSelectedUPDStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.leaf(r.itm_cd());
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		// 展開しない
		_is_expand_all = false;

		callMS_MSBEL2540_Srch01();
	}
	/**
	 * Panel[Rpnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		// 展開する
		_is_expand_all = true;

		callMS_MSBEL2540_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setCheck(true);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setCheck(false);
	}

	/**
	 * Panel[Btn]のボタン[accept_gr]の押下時の処理
	 */
	@Override
	public void doBtn_accept_gr(MCEventInfo info) {
		MCList<DtlGiR> inL = MCList.create(DtlGiR.class);
		for(RsltR r : getRsltL()){
			if (r.check()){
				DtlGiR addR = DtlGiR.create();
				copy(addR, r, createMap_DtlGiR_RsltR());
				addR.setStatus(Status.CREATE);
				inL.add(addR);
			}
		}
		if(inL.size() > 0){
			if(_msbe2520 != null){
				clearEmptyRows(_msbe2520.getDtlGrL());
				_msbe2520.getDtlGrL().addAll(inL);
				_msbe2520.doDtlGr_afterAddList(inL);
			}
			statusClear();
			requestCloseWindow();
		}
		else{
			throw new MCAppException(this.msgNoSelectedRow());
		}
	}
	/**
	 * Panel[Btn]のボタン[accept_gi]の押下時の処理
	 */
	@Override
	public void doBtn_accept_gi(MCEventInfo info) {
		MCList<DtlGiR> outL = MCList.create(DtlGiR.class);
		for(RsltR r : getRsltL()){
			if (r.check()){
				DtlGiR addR = DtlGiR.create();
				copy(addR, r, createMap_DtlGiR_RsltR());
				addR.setStatus(Status.CREATE);
				outL.add(addR);
			}
		}
		if(outL.size() > 0){
			if(_msbe2520 != null){
				clearEmptyRows(_msbe2520.getDtlGiL());
				_msbe2520.getDtlGiL().addAll(outL);
				_msbe2520.doDtlGi_afterAddList(outL);
			}
			statusClear();
			requestCloseWindow();
		}
		else{
			throw new MCAppException(this.msgNoSelectedRow());
		}
	}
	/**
	 * 空行を除外する。
	 * @param list 除外対象のリスト(MSBE2520)
	 */
	protected void clearEmptyRows(MCList<DtlGiR> list){
		MCList<DtlGiR> tempList = MCList.create(DtlGiR.class) ;
		for(DtlGiR  r: list){
			if(!isNull(r.itm_cd())) {
				tempList.add(r);
			}
		}
		// 空行を除外したリストを再設定
		list.setAll(tempList);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_itm_p_PPanel.addItmLCListner(this);
	}
	// ---- NC -----------------
	@Override
	public void doCnd_ope_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_ope_NC(info);
		//一覧をクリアする。
		getRsltL().clear();
		setSRCHStatus();
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Cnd_itm_p_PPanel.isItm(lc)) {
			doCnd_itm_LC(info);
		}
	}
	// 品目の変更
	protected void doCnd_itm_LC(MCEventInfo info) {
		setValueEx(Cnd_bom_ptn, null);
	}
	
	// ------------セルコンフィグ------------
	
	@Override
	public void doCnd_loc_cd_LC(MCEventInfo info) {
		super.doCnd_loc_cd_LC(info);
		setValueEx(Cnd_bom_ptn, null);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}
	/**
	 * RsltPrmsTable用のセルコンフィグ
	 */
	protected MCCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	/**
	 * RsltPrmsTable用のセルコンフィグ
	 */
	public class RsltTableCellConfig extends MAUDP_CellConfig {
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
				
			RsltR rslt = (RsltR) table.getBaseTable().getRow(index);
			if (!MAC_STK_MNG_TYP.isMNG(rslt.stk_mng_typ())) {
				if (column == columnRslt_check) {
					return MCMode.READ_ONLY;
				}
			}	
			
			return super.getPriorMode(index, column, table);
		}
	}

	// ------------オープン時の処理実装------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place, columnRslt_base_unit_conv_rnd_typ, columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);
		Rslt_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
	}
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		
		if(isSelectedGR()){
			setValueEx(Cnd_ope_Group,Cnd_ope_GR.getActionCommand());
		}else{
			setValueEx(Cnd_ope_Group,Cnd_ope_GI.getActionCommand());
		}
	}
	
	@Override
	protected void setValueByScreenOpener() {
		super.setValueByScreenOpener();
		/* 画面遷移後に変更を制御
		 * 理由）画面遷移時に呼び出し元画面側から種別の変更をしたい為、
		 *           画面起動時点では入力可としている。　
		 */
//		Cnd_ope_Group.setMode(MCMode.READ_ONLY);
	}
	
	@Override
	public void setUPD_IStatus(){
		super.setUPD_IStatus();
		setFocus();
	}
	
	@Override
	public void setUPD_OStatus(){
		super.setUPD_OStatus();
		setFocus();
	}
	/**
	 * 呼び出し元の画面(MSBE2520)を設定する。　<p>
	 *   ※ 本画面で選択した結果を反映する対象画面を指定してください。
	 * @param msbe2520Panel 呼び出し元の画面(MSBE2520)
	 */
	public void set_msbe2520(MSBEP_StkXfrActReg msbe2520Panel){
		_msbe2520 = msbe2520Panel;
	}
	// ------------その他共通処理------------	
	protected void setCheck(Boolean sts){
		for(RsltR r : RsltTable.getViewRows() ){
			if(!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
				continue;
			}
			setValueEx(columnRslt_check, r.getGUIIndex(), sts);
		}
	}
	protected boolean isSelectedGR() {
		return Cnd_ope_GR.isSelected();
	}
	protected boolean isSelectedGI() {
		return Cnd_ope_GI.isSelected();
	}
	
	protected void setSelectedUPDStatus(){
		if(isSelectedGR()){
			setUPD_IStatus();
		}else if(isSelectedGI()){
			setUPD_OStatus();
		}
	}
	
	protected void setFocus(){
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
		}else{
			CndPanel.focusFirstComponent();
		}
	}
	
	//mapper
	protected Map_DtlGiR_RsltR<DtlGiR,RsltR> createMap_DtlGiR_RsltR() {
		return new Map_DtlGiR_RsltR<DtlGiR, RsltR>();
	}

	public class Map_DtlGiR_RsltR<D extends DtlGiR, S extends RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlGiR.$itm_p, RsltR.$itm_p);
			addColumnPathMap(DtlGiR.$not_new_lot_flg, RsltR.$not_new_lot_flg);
			addColumnPathMap(DtlGiR.$lot_mng_typ, RsltR.$lot_mng_typ);
			addColumnPathMap(DtlGiR.$lot_no_typ, RsltR.$lot_no_typ);
			addColumnPathMap(DtlGiR.$lot_no_ptn_cd, RsltR.$lot_no_ptn_cd);
			addColumnPathMap(DtlGiR.$sublot_mng_typ, RsltR.$sublot_mng_typ);
			addColumnPathMap(DtlGiR.$sublot_no_typ, RsltR.$sublot_no_typ);
			addColumnPathMap(DtlGiR.$sublot_no_ptn_cd, RsltR.$sublot_no_ptn_cd);
			addColumnPathMap(DtlGiR.$sno1_mng_typ, RsltR.$sno1_mng_typ);
			addColumnPathMap(DtlGiR.$sno2_mng_typ, RsltR.$sno2_mng_typ);
			addColumnPathMap(DtlGiR.$sno3_mng_typ, RsltR.$sno3_mng_typ);
			addColumnPathMap(DtlGiR.$sno4_mng_typ, RsltR.$sno4_mng_typ);
			addColumnPathMap(DtlGiR.$trd_unit_qty, RsltR.$trd_unit_qty);
			addColumnPathMap(DtlGiR.$trd_unit_cd, RsltR.$trd_unit_cd);
			addColumnPathMap(DtlGiR.$trd_unit_nm, RsltR.$trd_unit_nm);
			addColumnPathMap(DtlGiR.$trd_unit_dec_place, RsltR.$trd_unit_dec_place);
			addColumnPathMap(DtlGiR.$trd_unit_conv_base_qty, RsltR.$trd_unit_conv_base_qty);
			addColumnPathMap(DtlGiR.$trd_unit_conv_qty, RsltR.$trd_unit_conv_qty);
			addColumnPathMap(DtlGiR.$base_unit_qty, RsltR.$base_unit_qty);
			addColumnPathMap(DtlGiR.$base_unit_cd, RsltR.$base_unit_cd);
			addColumnPathMap(DtlGiR.$base_unit_nm, RsltR.$base_unit_nm);
			addColumnPathMap(DtlGiR.$base_unit_dec_place, RsltR.$base_unit_dec_place);
			addColumnPathMap(DtlGiR.$base_unit_conv_rnd_typ, RsltR.$base_unit_conv_rnd_typ);
			addColumnPathMap(DtlGiR.$sno1, RsltR.$min_sno1);
			addColumnPathMap(DtlGiR.$sno2, RsltR.$min_sno2);
			addColumnPathMap(DtlGiR.$sno3, RsltR.$min_sno3);
			addColumnPathMap(DtlGiR.$sno4, RsltR.$min_sno4);
			addColumnPathMap(DtlGiR.$std_cont_fctr_qty, RsltR.$std_cont_fctr_qty);
			addColumnPathMap(DtlGiR.$std_cont_fctr, RsltR.$std_cont_fctr);
			addColumnPathMap(DtlGiR.$cont_fctr_unit_cd, RsltR.$cont_fctr_unit_cd);
			addColumnPathMap(DtlGiR.$cont_fctr_unit_nm, RsltR.$cont_fctr_unit_nm);
			addColumnPathMap(DtlGiR.$cont_fctr_rnd_typ, RsltR.$cont_fctr_rnd_typ);
			addColumnPathMap(DtlGiR.$cont_fctr_dec_place, RsltR.$cont_fctr_dec_place);
			addColumnPathMap(DtlGiR.$cont_fctr_flg, RsltR.$cont_fctr_flg);
		}
	}

}