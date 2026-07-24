package mcframe.clientMSBE.MSBEP0110;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StkListPrnt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkListPrnt_MC extends MSBEP_StkListPrnt_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	String _openTyp = null;//画面起動タイプ
	protected MCList<DtlR> _cndL = createDtlL();	//遷移時の引継ぎ条件
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkListPrnt_MC() {
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
	public MSBEP_StkListPrnt_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0110_Srch01Caller<P extends MSBEP_StkListPrnt, B extends MS_MSBEL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			//検索時には何もしない。
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_cndL);
		}
		@Override
		protected void show() {
			super.show();
			setRmndrFlg();
		}

		/**
		 * 選択チェック、端数印刷の値を設定
		 */
		protected void setRmndrFlg(){
			for (DtlR r : getDtlL()){
				if (T4 == _openTyp || T5 == _openTyp){
					if (!r.stk_lst_prnt_flg()){
						//製造指図・製造実績関連の画面から遷移した場合は、現品票未発行の場合に選択チェックをオンにする
						setValueEx(columnDtl_check, r.getGUIIndex(), true);
					}
				}
				else {
					setValueEx(columnDtl_check, r.getGUIIndex(), true);
				}

				if (!isNull(r.rmndr_unit_qty())){
					//端数かどうかの目印
					setValueEx(columnDtl_rmndr_prnt_flg, r.getGUIIndex(), true);
				}
			}
		}

		@Override
		protected void sort() {
			return;
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (T1 == _openTyp) {
				setPRNT_ARRStatus();
			}
			else if (T2 == _openTyp || T3 == _openTyp) {
				setPRNT_SHIPStatus();
			}
			else if (T4 == _openTyp || T5 == _openTyp) {
				setPRNT_MFGStatus();
			}
			else {
				setPRNT_STKStatus();
			}
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			
			if (T1 == _openTyp) {
				setFIX_ARRStatus();
			}
			else if (T2 == _openTyp || T3 == _openTyp) {
				setFIX_SHIPStatus();
			}
			else if (T4 == _openTyp || T5 == _openTyp) {
				setFIX_MFGStatus();
			}
			else {
				setFIX_STKStatus();
			}
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}

		@Override
		protected void showNoDownDataMsg() {
			// 何もしない。
		}
	}

	/**
	 * [MS_MSBEL0110_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0110_Prnt01Caller<P extends MSBEP_StkListPrnt, B extends MS_MSBEL0110_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL0110_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean execConfirm() {
			boolean cnf = false;
			MCNumber cnf_num = getCo().stk_lst_cnf_num();
			if (isNull(cnf_num) || !cnf_num.isPositive()) {
				cnf_num = MCNumber.ONE.multiply(100);
			}
			for (DtlR r : getDtlL().subList(r -> r.check())) {
				if (!isNull(r.prnt_all_qty()) && r.prnt_all_qty().gt(cnf_num)) {
					cnf = true;
					break;
				}
			}
			
			if (cnf) {
				return (confirm(MSBEP0036, cnf_num) == MCMessageBox.YES_OPTION);
			}
			else {
				return super.execConfirm();
			}
		}
	}


	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL0110_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}


	// ----------------------画面遷移設定-----------------------
	/**
	 * <P>
	 * <li>起動タイプ：T1 <br>
	 * 仕入実績登録画面、仕入実績一覧登録画面、入荷実績一覧登録画面から画面を起動する。
	 * </li>
	 * <li>起動タイプ：T2 <br>
	 * 出荷実績一覧登録画面、出荷実績登録画面から画面を起動する。
	 * </li>
	 * <li>起動タイプ：T3 <br>
	 * 出荷指図一覧登録画面、出荷指図登録画面から画面を起動する。
	 * </li>
	 * <li>起動タイプ：T4 <br>
	 * 製造実績登録画面、製造実績一覧登録画面から画面を起動する。
	 * </li>
	 * <li>起動タイプ：T5 <br>
	 * 製造指図登録画面、製造指図一覧登録画面、工程製造指図一覧登録画面から画面を起動する。
	 * </li>
	 * <li>起動タイプ：T6 <br>
	 * 現状在庫一覧照会画面から画面を起動する。
	 * </li>
	 * </P>
	 * 
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		_openTyp = openTyp;
		_cndL.clear();
		
		if (T1 == openTyp) {
			// 入荷実績関連の画面から起動
			if(!isNull(bind.getString(DtlR.$arr_act_no))){
				if (args == null){
					// 単票画面から起動された場合
					doOpen_MSBEP0110_T1_Caller(bind.getString(DtlR.$arr_act_no));
				}
				else {
					// 一覧画面から起動された場合
					if (args[0] instanceof MCList) {

						MCList list = (MCList) args[0];

						if (list.createRow() instanceof IfMSBEP0110_T1_DtlR) {
							doOpen_MSBEP0110_T1_List_Caller(list);
						}
						else {
							throw new MCAppException(msgUnknownClass(list.createRow()));
						}
					}
					else {
						throw new MCAppException(msgUnknownOpenParam());
					}
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
		else if (T2 == openTyp) {
			// 出荷実績関連の画面から起動
			if(!isNull(bind.getString(DtlR.$ship_act_no))){
				if (args == null){
					// 単票画面から起動された場合
					doOpen_MSBEP0110_T2_Caller(bind.getString(DtlR.$ship_act_no));
				}
				else {
					// 一覧画面から起動された場合
					if (args[0] instanceof MCList) {

						MCList list = (MCList) args[0];

						if (list.createRow() instanceof IfMSBEP0110_T2_DtlR) {
							doOpen_MSBEP0110_T2_List_Caller(list);
						}
						else {
							throw new MCAppException(msgUnknownClass(list.createRow()));
						}
					}
					else {
						throw new MCAppException(msgUnknownOpenParam());
					}
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
		else if (T3 == openTyp) {
			// 出荷指図関連の画面から起動
			if(!isNull(bind.getString(DtlR.$ship_inst_no))){
				if (args == null){
					// 単票画面から起動された場合
					doOpen_MSBEP0110_T3_Caller(bind.getString(DtlR.$ship_inst_no));
				}
				else {
					// 一覧画面から起動された場合
					if (args[0] instanceof MCList) {

						MCList list = (MCList) args[0];

						if (list.createRow() instanceof IfMSBEP0110_T3_DtlR) {
							doOpen_MSBEP0110_T3_List_Caller(list);
						}
						else {
							throw new MCAppException(msgUnknownClass(list.createRow()));
						}
					}
					else {
						throw new MCAppException(msgUnknownOpenParam());
					}
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
		else if (T4 == openTyp) {
			// 製造実績関連の画面から起動
			if(!isNull(bind.getString(DtlR.$mfg_act_no))){
				if (args == null){
					// 単票画面から起動された場合
					doOpen_MSBEP0110_T4_Caller(bind.getString(DtlR.$mfg_act_no));
				}
				else {
					// 一覧画面から起動された場合
					if (args[0] instanceof MCList) {

						MCList list = (MCList) args[0];

						if (list.createRow() instanceof IfMSBEP0110_T4_DtlR) {
							doOpen_MSBEP0110_T4_List_Caller(list);
						}
						else {
							throw new MCAppException(msgUnknownClass(list.createRow()));
						}
					}
					else {
						throw new MCAppException(msgUnknownOpenParam());
					}
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
		else if (T5 == openTyp) {
			// 製造指図関連の画面から起動
			if(!isNull(bind.getString(DtlR.$mfg_inst_no))){
				if (args == null){
					// 単票画面から起動された場合
					doOpen_MSBEP0110_T5_Caller(bind.getString(DtlR.$mfg_inst_no));
				}
				else {
					// 一覧画面から起動された場合
					if (args[0] instanceof MCList) {

						MCList list = (MCList) args[0];

						if (list.createRow() instanceof IfMSBEP0110_T5_DtlR) {
							doOpen_MSBEP0110_T5_List_Caller(list);
						}
						else {
							throw new MCAppException(msgUnknownClass(list.createRow()));
						}
					}
					else {
						throw new MCAppException(msgUnknownOpenParam());
					}
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
		else if (T6 == openTyp) {
			// 現状在庫一覧照会画面から起動
			if (args[0] instanceof MCList) {
				MCList list = (MCList) args[0];

				if (list.createRow() instanceof IfMSBEP0110_T6_DtlR) {
					doOpen_MSBEP0110_T6_Caller(list);
				}
				else {
					throw new MCAppException(msgUnknownClass(list.createRow()));
				}
			}
			else {
				throw new MCAppException(msgUnknownOpenParam());
			}
		}
	}

	@Override
	protected void screenOpenStatusClear() {
		// 画面遷移後の初期表示で選択オンの場合があり、行ステータスをクリアしたくないのでオーバライドする
	}

	protected void doOpen_MSBEP0110_T1_List_Caller(List<IfMSBEP0110_T1_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T1_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT1Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	protected void doOpen_MSBEP0110_T1_Caller(String arrActNo){

		DtlR dR = DtlR.create();
		dR.arr_act_no(arrActNo);

		_cndL.add(dR);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T1モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT1Dtl(DtlR d, IfMSBEP0110_T1_DtlR dtl) {
		d.arr_act_no(dtl.arr_act_no());
	}

	protected void doOpen_MSBEP0110_T2_List_Caller(List<IfMSBEP0110_T2_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T2_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT2Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	protected void doOpen_MSBEP0110_T2_Caller(String shipActNo){

		DtlR dR = DtlR.create();
		dR.ship_act_no(shipActNo);

		_cndL.add(dR);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T2モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT2Dtl(DtlR d, IfMSBEP0110_T2_DtlR dtl) {
		d.ship_act_no(dtl.ship_act_no());
	}

	protected void doOpen_MSBEP0110_T3_List_Caller(List<IfMSBEP0110_T3_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T3_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT3Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	protected void doOpen_MSBEP0110_T3_Caller(String shipInstNo){

		DtlR dR = DtlR.create();
		dR.ship_inst_no(shipInstNo);

		_cndL.add(dR);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T3モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT3Dtl(DtlR d, IfMSBEP0110_T3_DtlR dtl) {
		d.ship_inst_no(dtl.ship_inst_no());
	}

	protected void doOpen_MSBEP0110_T4_List_Caller(List<IfMSBEP0110_T4_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T4_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT4Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	protected void doOpen_MSBEP0110_T4_Caller(String mfgActNo){

		DtlR dR = DtlR.create();
		dR.mfg_act_no(mfgActNo);

		_cndL.add(dR);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T4モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT4Dtl(DtlR d, IfMSBEP0110_T4_DtlR dtl) {
		d.mfg_act_no(dtl.mfg_act_no());
	}

	protected void doOpen_MSBEP0110_T5_List_Caller(List<IfMSBEP0110_T5_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T5_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT5Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	protected void doOpen_MSBEP0110_T5_Caller(String mfgInstNo){

		DtlR dR = DtlR.create();
		dR.mfg_inst_no(mfgInstNo);

		_cndL.add(dR);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T5モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT5Dtl(DtlR d, IfMSBEP0110_T5_DtlR dtl) {
		d.mfg_inst_no(dtl.mfg_inst_no());
	}

	protected void doOpen_MSBEP0110_T6_Caller(List<IfMSBEP0110_T6_DtlR> dtlList){

		MCList<DtlR> dl = MCList.create(DtlR.class);

		// 一覧情報設定
		for (IfMSBEP0110_T6_DtlR dtl : dtlList) {
			DtlR d = DtlR.create();
			copyT6Dtl(d, dtl);
			dl.add(d);
		}

		_cndL.setAll(dl);
		callMS_MSBEL0110_Srch01();
	}

	/**
	 * T6モードの画面遷移用明細項目コピー処理
	 * 
	 * @param d
	 * @param dtl
	 */
	protected void copyT6Dtl(DtlR d, IfMSBEP0110_T6_DtlR dtl) {
		d.itm_cd(dtl.itm_cd());
		d.itm_sub1(dtl.itm_sub1());
		d.itm_sub2(dtl.itm_sub2());
		d.itm_sub3(dtl.itm_sub3());
		d.lot_no(dtl.lot_no());
		d.sublot_no(dtl.sublot_no());
		d.ver_no(dtl.ver_no());
		d.loc_cd(dtl.loc_cd());
		d.str_ln_cd(dtl.str_ln_cd());
		d.sno1(dtl.sno1());
		d.sno2(dtl.sno2());
		d.sno3(dtl.sno3());
		d.sno4(dtl.sno4());
		d.gd_cd(dtl.gd_cd());
		d.in_xfr_typ(dtl.in_xfr_typ());
		d.quality_typ(dtl.quality_typ());
		d.stk_insp_typ(dtl.stk_insp_typ());
		d.asst_typ(dtl.asst_typ());
		d.stk_id_typ(dtl.stk_id_typ());
		d.stk_bp_cd(dtl.stk_bp_cd());
		d.fix_no_typ(dtl.fix_no_typ());
		d.fix_no(dtl.fix_no());
		d.stk_arrv_bp_cd(dtl.stk_arrv_bp_cd());
		d.pack_unit_cd(dtl.pack_unit_cd());
		d.base_unit_cd(dtl.base_unit_cd());
		d.dlv_inst_unit_cd(dtl.base_unit_cd());
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_qty_per_pckg_unit_p_PPanel.setRelateBeans(columnDtl_unit_cd_per_pckg_unit, columnDtl_base_unit_dec_place);
		Dtl_rmndr_unit_qty_p_PPanel.setRelateBeans(columnDtl_rmndr_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_pack_unit_cd, columnDtl_pack_unit_dec_place);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_dlv_inst_qty_p_PPanel.setRelateBeans(columnDtl_dlv_inst_unit_cd, columnDtl_dlv_inst_unit_dec_place);
	}

	@Override
	protected void setSortColumn() {
		//サーバ側で指定したソート順（遷移元画面の表示順）を保持するため、デフォルト値は指定しない
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlTableCellConfig extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			// 非表示のカラムはモードを変更しない
			if (MCMode.INVISIBLE_STATUS == column.getModeInfo().getStatus()) {
					return super.getPriorMode(index, column, table);
			}

			return getPriorModeSub(index, column, table);
		}

		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 * 
		 * @param index
		 * @param column
		 * @param table
		 * @return
		 */
		@SuppressWarnings("unchecked")
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {

			DtlR dtl = (DtlR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			// 選択がチェックされていない場合、選択以外は入力不可
			if (column != columnDtl_check && !dtl.check()) {
				return MCMode.READ_ONLY;
			}
			// 端数が設定されていない場合、端数印刷は入力不可
			if (column == columnDtl_rmndr_prnt_flg) {
				if (isNull(dtl.rmndr_unit_qty())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isArrAct(DtlR r) {

		if (!isNull(r.arr_act_no())) {
			return true;
		}

		return false;
	}

	protected boolean isShipAct(DtlR r) {

		if (!isNull(r.ship_act_no())) {
			return true;
		}

		return false;
	}

	protected boolean isShipInst(DtlR r) {

		if (isNull(r.ship_act_no()) && !isNull(r.ship_inst_no())) {
			return true;
		}

		return false;
	}

	protected boolean isYieldAct(DtlR r) {

		if (!isNull(r.yield_act_no())) {
			return true;
		}

		return false;
	}

	protected boolean isYieldSchd(DtlR r) {

		if (!isNull(r.yield_schd_no())) {
			return true;
		}

		return false;
	}

// IfListRegPanel
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

}