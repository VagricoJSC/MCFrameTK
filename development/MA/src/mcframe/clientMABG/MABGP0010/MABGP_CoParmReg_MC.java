package mcframe.clientMABG.MABGP0010;

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
import mcframe.clientCore.sys.MCSys;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_CoParmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_CoParmReg_MC extends MABGP_CoParmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CoParmReg_MC() {
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
	public MABGP_CoParmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void mcInit() {
		super.mcInit();
		setComponentInvisibleAllStatus();
	}
	protected void setComponentInvisibleAllStatus() {
		int sno_typ = getSnoTyp(this);
		
		MCModeBeans[] sno_use_typ = {Base_sno1_use_typ, Base_sno2_use_typ, Base_sno3_use_typ, Base_sno4_use_typ};
		MCModeBeans[] sno_use_typ_nm = {Base_sno1_use_typ_nm, Base_sno2_use_typ_nm, Base_sno3_use_typ_nm, Base_sno4_use_typ_nm};
		MCModeBeans[] sno_non_mov_flg = {Base_sno1_non_mov_flg, Base_sno2_non_mov_flg, Base_sno3_non_mov_flg, Base_sno4_non_mov_flg};

		for (int i = 0; i < sno_use_typ.length; i++) {
			if (i >= sno_typ) {
				MCModeBeans o1 = sno_use_typ[i];
				MCModeBeans o2 = sno_use_typ_nm[i];
				MCModeBeans o3 = sno_non_mov_flg[i];
				for (String s : getStatusSet()) {
					o1.putMode(this, s, MCMode.INVISIBLE);
					o2.putMode(this, s, MCMode.INVISIBLE);
					o3.putMode(this, s, MCMode.INVISIBLE);
				}
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABGL0010_Srch01();
	}
	/**
	 * [MA_MABGL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Srch01Caller<P extends MABGP_CoParmReg, B extends MA_MABGL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			panel.clearAll();
		}
		@Override
		protected void show() {
			super.show();
			downCnv();
		}

	    @Override
	    protected void moveFocus() {
	    	TabTab.focusActiveFirstComponent();
	    }

		/**
	     * 検索結果のリストを編集します。
	     */
	    protected void downCnv(){
			for (DtlR r: getDtlL()){
				downRowCnv(r);
			}
	    }

	    /**
	     * 検索結果の行を編集します。
	     * @param r 編集対象のRow
	     */
	    protected void downRowCnv(DtlR r){
			if (!isNull(r)) {
				BaseR br = getBaseR();
				copy(br, r, createMap_BaseR_DtlR());
				
				DtlTable.selectLeftmostColumn(0);
			}
	    }
	}

	/**
	 * [MA_MABGL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Upd01Caller<P extends MABGP_CoParmReg, B extends MA_MABGL0010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean execConfirm() {
			if(super.execConfirm()){
				setDtlBlock();
				return true;
			}
			return false;	
		}
		
		/**更新状況に応じたBaseRからDtlLへのデータコピーを行います。*/
		protected void setDtlBlock(){

			MCList<DtlR> d = getDtlL();
			
			BaseR br = getBaseR();
			DtlR dr = d.createRow();

			//guiIndexを-1にしないために、d.add(dr)より先にcopyをおこなう
			copy(dr, br, createMap_DtlR_BaseR());
			
			d.clear();
			d.add(dr);
			dr.co_cd(getCoCd());
			dr.setGUIIndex(-1);
			if (!isNull(dr.upd_cntr())) {
				dr.setStatus(Status.MODIFY);
			} else {
				dr.setStatus(Status.CREATE);
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getBaseR()));
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return super.msgExecConfirm();
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList){
			checkReq(msgList);
		}
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOperFlgStatus();
		setAsstAndStkBpFlgStatus();
	}

	/**
	 * [MA_MABGL0010_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Del01Caller<P extends MABGP_CoParmReg, B extends MA_MABGL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0010_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupDtl();
			return super.checkForCall();
		}

		protected void setupDtl() {
			MCList<DtlR> d = getDtlL();
			
			BaseR br = getBaseR();
			DtlR dr = d.createRow();

			//guiIndexを-1にしないために、d.add(dr)より先にcopyをおこなう
			copy(dr, br, createMap_DtlR_BaseR());
			
			d.clear();
			d.add(dr);
			dr.co_cd(getCoCd());
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}

		@Override
		protected void statusClear() {
			getBaseR().setStatus(MCRow.NONE);
			getDtlL().setStatus(MCRow.NONE);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
	}


	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0010_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0010_Del01();
	}

	/** ログインユーザの会社コードを返す。*/
	protected String getCoCd() {
		return MCSys.user.coCD();
	}
    
	/** ログインユーザの会社名を返す。*/
	protected String getCoNm() {
		return MCSys.user.coNm();
	}
	
	protected Map_BaseR_DtlR<BaseR,DtlR> createMap_BaseR_DtlR() {
		return new Map_BaseR_DtlR<BaseR, DtlR>();
	}

	public class Map_BaseR_DtlR<D extends BaseR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(BaseR.$co_cd, DtlR.$co_cd);
			addColumnPathMap(BaseR.$std_rnd_typ, DtlR.$std_rnd_typ);
			addColumnPathMap(BaseR.$std_rnd_typ_nm, DtlR.$std_rnd_typ_nm);
			addColumnPathMap(BaseR.$std_dec_place, DtlR.$std_dec_place);
			addColumnPathMap(BaseR.$amt_rnd_typ, DtlR.$amt_rnd_typ);
			addColumnPathMap(BaseR.$amt_rnd_typ_nm, DtlR.$amt_rnd_typ_nm);
			addColumnPathMap(BaseR.$amt_dec_place, DtlR.$amt_dec_place);
			addColumnPathMap(BaseR.$ave_rnd_typ, DtlR.$ave_rnd_typ);
			addColumnPathMap(BaseR.$ave_rnd_typ_nm, DtlR.$ave_rnd_typ_nm);
			addColumnPathMap(BaseR.$ave_dec_place, DtlR.$ave_dec_place);
			addColumnPathMap(BaseR.$adj_typ, DtlR.$adj_typ);
			addColumnPathMap(BaseR.$adj_typ_nm, DtlR.$adj_typ_nm);
			addColumnPathMap(BaseR.$mrgn_expns_cd, DtlR.$mrgn_expns_cd);
			addColumnPathMap(BaseR.$mrgn_expns_nm, DtlR.$mrgn_expns_nm);
			addColumnPathMap(BaseR.$purc_expns_cd, DtlR.$purc_expns_cd);
			addColumnPathMap(BaseR.$purc_expns_nm, DtlR.$purc_expns_nm);
			addColumnPathMap(BaseR.$out_expns_cd, DtlR.$out_expns_cd);
			addColumnPathMap(BaseR.$out_expns_nm, DtlR.$out_expns_nm);
			addColumnPathMap(BaseR.$inpt_expns_cd, DtlR.$inpt_expns_cd);
			addColumnPathMap(BaseR.$inpt_expns_nm, DtlR.$inpt_expns_nm);
			addColumnPathMap(BaseR.$ss_expns_cd, DtlR.$ss_expns_cd);
			addColumnPathMap(BaseR.$ss_expns_nm, DtlR.$ss_expns_nm);
			addColumnPathMap(BaseR.$prov_expns_cd, DtlR.$prov_expns_cd);
			addColumnPathMap(BaseR.$prov_expns_nm, DtlR.$prov_expns_nm);
			addColumnPathMap(BaseR.$pre_alc_max_lvl, DtlR.$pre_alc_max_lvl);
			addColumnPathMap(BaseR.$pre_alc_max_rec, DtlR.$pre_alc_max_rec);
			addColumnPathMap(BaseR.$diff_use_typ, DtlR.$diff_use_typ);
			addColumnPathMap(BaseR.$diff_use_typ_nm, DtlR.$diff_use_typ_nm);
			addColumnPathMap(BaseR.$lot_use_typ, DtlR.$lot_use_typ);
			addColumnPathMap(BaseR.$lot_use_typ_nm, DtlR.$lot_use_typ_nm);
			addColumnPathMap(BaseR.$sublot_use_typ, DtlR.$sublot_use_typ);
			addColumnPathMap(BaseR.$sublot_use_typ_nm, DtlR.$sublot_use_typ_nm);
			addColumnPathMap(BaseR.$sno1_use_typ, DtlR.$sno1_use_typ);
			addColumnPathMap(BaseR.$sno1_use_typ_nm, DtlR.$sno1_use_typ_nm);
			addColumnPathMap(BaseR.$sno2_use_typ, DtlR.$sno2_use_typ);
			addColumnPathMap(BaseR.$sno2_use_typ_nm, DtlR.$sno2_use_typ_nm);
			addColumnPathMap(BaseR.$sno3_use_typ, DtlR.$sno3_use_typ);
			addColumnPathMap(BaseR.$sno3_use_typ_nm, DtlR.$sno3_use_typ_nm);
			addColumnPathMap(BaseR.$sno4_use_typ, DtlR.$sno4_use_typ);
			addColumnPathMap(BaseR.$sno4_use_typ_nm, DtlR.$sno4_use_typ_nm);
			addColumnPathMap(BaseR.$def_calc_ctg_cd, DtlR.$def_calc_ctg_cd);
			addColumnPathMap(BaseR.$def_calc_ctg_nm, DtlR.$def_calc_ctg_nm);
			addColumnPathMap(BaseR.$fix_dpt_cd, DtlR.$fix_dpt_cd);
			addColumnPathMap(BaseR.$fix_dpt_nm, DtlR.$fix_dpt_nm);
			addColumnPathMap(BaseR.$trd_ratio_flg, DtlR.$trd_ratio_flg);
			addColumnPathMap(BaseR.$stop_slip_flg, DtlR.$stop_slip_flg);
			addColumnPathMap(BaseR.$non_prod_flg, DtlR.$non_prod_flg);
			addColumnPathMap(BaseR.$oper_sum_flg, DtlR.$oper_sum_flg);
			addColumnPathMap(BaseR.$non_sls_flg, DtlR.$non_sls_flg);
			addColumnPathMap(BaseR.$asst_flg, DtlR.$asst_flg);
			addColumnPathMap(BaseR.$stk_bp_flg, DtlR.$stk_bp_flg);
			addColumnPathMap(BaseR.$non_transit_flg, DtlR.$non_transit_flg);
			addColumnPathMap(BaseR.$tmp_dpt_cd, DtlR.$tmp_dpt_cd);
			addColumnPathMap(BaseR.$tmp_dpt_nm, DtlR.$tmp_dpt_nm);
			addColumnPathMap(BaseR.$chk_mst_flg, DtlR.$chk_mst_flg);
			addColumnPathMap(BaseR.$stktk_sum_flg, DtlR.$stktk_sum_flg);
			addColumnPathMap(BaseR.$oth_ccn_sum_flg, DtlR.$oth_ccn_sum_flg);
			addColumnPathMap(BaseR.$std_disp_digit, DtlR.$std_disp_digit);
			addColumnPathMap(BaseR.$amt_disp_digit, DtlR.$amt_disp_digit);
			addColumnPathMap(BaseR.$unit_disp_digit, DtlR.$unit_disp_digit);
			addColumnPathMap(BaseR.$rate_disp_digit, DtlR.$rate_disp_digit);
			addColumnPathMap(BaseR.$excel_pln_flg, DtlR.$excel_pln_flg);
			addColumnPathMap(BaseR.$excel_act_flg, DtlR.$excel_act_flg);
			addColumnPathMap(BaseR.$excel_alc_flg, DtlR.$excel_alc_flg);
			addColumnPathMap(BaseR.$ins_usr_id, DtlR.$ins_usr_id);
			addColumnPathMap(BaseR.$ins_usr_nm, DtlR.$ins_usr_nm);
			addColumnPathMap(BaseR.$ins_ts, DtlR.$ins_ts);
			addColumnPathMap(BaseR.$ins_func_id, DtlR.$ins_func_id);
			addColumnPathMap(BaseR.$ins_func_nm, DtlR.$ins_func_nm);
			addColumnPathMap(BaseR.$upd_cntr, DtlR.$upd_cntr);
			addColumnPathMap(BaseR.$upd_usr_id, DtlR.$upd_usr_id);
			addColumnPathMap(BaseR.$upd_usr_nm, DtlR.$upd_usr_nm);
			addColumnPathMap(BaseR.$upd_ts, DtlR.$upd_ts);
			addColumnPathMap(BaseR.$upd_func_id, DtlR.$upd_func_id);
			addColumnPathMap(BaseR.$upd_func_nm, DtlR.$upd_func_nm);
			addColumnPathMap(BaseR.$upd_srv_req_no, DtlR.$upd_srv_req_no);
			addColumnPathMap(BaseR.$wg_non_mov_flg, DtlR.$wg_non_mov_flg);
			addColumnPathMap(BaseR.$lot_non_mov_flg, DtlR.$lot_non_mov_flg);
			addColumnPathMap(BaseR.$sublot_non_mov_flg, DtlR.$sublot_non_mov_flg);
			addColumnPathMap(BaseR.$sno1_non_mov_flg, DtlR.$sno1_non_mov_flg);
			addColumnPathMap(BaseR.$sno2_non_mov_flg, DtlR.$sno2_non_mov_flg);
			addColumnPathMap(BaseR.$sno3_non_mov_flg, DtlR.$sno3_non_mov_flg);
			addColumnPathMap(BaseR.$sno4_non_mov_flg, DtlR.$sno4_non_mov_flg);
			addColumnPathMap(BaseR.$act_trd_calc_ctg_cd, DtlR.$act_trd_calc_ctg_cd);
			addColumnPathMap(BaseR.$act_trd_calc_ctg_nm, DtlR.$act_trd_calc_ctg_nm);
		}
	}
	protected Map_DtlR_BaseR<DtlR,BaseR> createMap_DtlR_BaseR() {
		return new Map_DtlR_BaseR<DtlR, BaseR>();
	}

	public class Map_DtlR_BaseR<D extends DtlR, S extends BaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$co_cd, BaseR.$co_cd);
			addColumnPathMap(DtlR.$std_rnd_typ, BaseR.$std_rnd_typ);
			addColumnPathMap(DtlR.$std_rnd_typ_nm, BaseR.$std_rnd_typ_nm);
			addColumnPathMap(DtlR.$std_dec_place, BaseR.$std_dec_place);
			addColumnPathMap(DtlR.$amt_rnd_typ, BaseR.$amt_rnd_typ);
			addColumnPathMap(DtlR.$amt_rnd_typ_nm, BaseR.$amt_rnd_typ_nm);
			addColumnPathMap(DtlR.$amt_dec_place, BaseR.$amt_dec_place);
			addColumnPathMap(DtlR.$ave_rnd_typ, BaseR.$ave_rnd_typ);
			addColumnPathMap(DtlR.$ave_rnd_typ_nm, BaseR.$ave_rnd_typ_nm);
			addColumnPathMap(DtlR.$ave_dec_place, BaseR.$ave_dec_place);
			addColumnPathMap(DtlR.$adj_typ, BaseR.$adj_typ);
			addColumnPathMap(DtlR.$adj_typ_nm, BaseR.$adj_typ_nm);
			addColumnPathMap(DtlR.$mrgn_expns_cd, BaseR.$mrgn_expns_cd);
			addColumnPathMap(DtlR.$mrgn_expns_nm, BaseR.$mrgn_expns_nm);
			addColumnPathMap(DtlR.$purc_expns_cd, BaseR.$purc_expns_cd);
			addColumnPathMap(DtlR.$purc_expns_nm, BaseR.$purc_expns_nm);
			addColumnPathMap(DtlR.$out_expns_cd, BaseR.$out_expns_cd);
			addColumnPathMap(DtlR.$out_expns_nm, BaseR.$out_expns_nm);
			addColumnPathMap(DtlR.$inpt_expns_cd, BaseR.$inpt_expns_cd);
			addColumnPathMap(DtlR.$inpt_expns_nm, BaseR.$inpt_expns_nm);
			addColumnPathMap(DtlR.$ss_expns_cd, BaseR.$ss_expns_cd);
			addColumnPathMap(DtlR.$ss_expns_nm, BaseR.$ss_expns_nm);
			addColumnPathMap(DtlR.$prov_expns_cd, BaseR.$prov_expns_cd);
			addColumnPathMap(DtlR.$prov_expns_nm, BaseR.$prov_expns_nm);
			addColumnPathMap(DtlR.$pre_alc_max_lvl, BaseR.$pre_alc_max_lvl);
			addColumnPathMap(DtlR.$pre_alc_max_rec, BaseR.$pre_alc_max_rec);
			addColumnPathMap(DtlR.$diff_use_typ, BaseR.$diff_use_typ);
			addColumnPathMap(DtlR.$diff_use_typ_nm, BaseR.$diff_use_typ_nm);
			addColumnPathMap(DtlR.$lot_use_typ, BaseR.$lot_use_typ);
			addColumnPathMap(DtlR.$lot_use_typ_nm, BaseR.$lot_use_typ_nm);
			addColumnPathMap(DtlR.$sublot_use_typ, BaseR.$sublot_use_typ);
			addColumnPathMap(DtlR.$sublot_use_typ_nm, BaseR.$sublot_use_typ_nm);
			addColumnPathMap(DtlR.$sno1_use_typ, BaseR.$sno1_use_typ);
			addColumnPathMap(DtlR.$sno1_use_typ_nm, BaseR.$sno1_use_typ_nm);
			addColumnPathMap(DtlR.$sno2_use_typ, BaseR.$sno2_use_typ);
			addColumnPathMap(DtlR.$sno2_use_typ_nm, BaseR.$sno2_use_typ_nm);
			addColumnPathMap(DtlR.$sno3_use_typ, BaseR.$sno3_use_typ);
			addColumnPathMap(DtlR.$sno3_use_typ_nm, BaseR.$sno3_use_typ_nm);
			addColumnPathMap(DtlR.$sno4_use_typ, BaseR.$sno4_use_typ);
			addColumnPathMap(DtlR.$sno4_use_typ_nm, BaseR.$sno4_use_typ_nm);
			addColumnPathMap(DtlR.$def_calc_ctg_cd, BaseR.$def_calc_ctg_cd);
			addColumnPathMap(DtlR.$def_calc_ctg_nm, BaseR.$def_calc_ctg_nm);
			addColumnPathMap(DtlR.$fix_dpt_cd, BaseR.$fix_dpt_cd);
			addColumnPathMap(DtlR.$fix_dpt_nm, BaseR.$fix_dpt_nm);
			addColumnPathMap(DtlR.$trd_ratio_flg, BaseR.$trd_ratio_flg);
			addColumnPathMap(DtlR.$stop_slip_flg, BaseR.$stop_slip_flg);
			addColumnPathMap(DtlR.$non_prod_flg, BaseR.$non_prod_flg);
			addColumnPathMap(DtlR.$oper_sum_flg, BaseR.$oper_sum_flg);
			addColumnPathMap(DtlR.$non_sls_flg, BaseR.$non_sls_flg);
			addColumnPathMap(DtlR.$asst_flg, BaseR.$asst_flg);
			addColumnPathMap(DtlR.$stk_bp_flg, BaseR.$stk_bp_flg);
			addColumnPathMap(DtlR.$non_transit_flg, BaseR.$non_transit_flg);
			addColumnPathMap(DtlR.$tmp_dpt_cd, BaseR.$tmp_dpt_cd);
			addColumnPathMap(DtlR.$tmp_dpt_nm, BaseR.$tmp_dpt_nm);
			addColumnPathMap(DtlR.$chk_mst_flg, BaseR.$chk_mst_flg);
			addColumnPathMap(DtlR.$stktk_sum_flg, BaseR.$stktk_sum_flg);
			addColumnPathMap(DtlR.$oth_ccn_sum_flg, BaseR.$oth_ccn_sum_flg);
			addColumnPathMap(DtlR.$std_disp_digit, BaseR.$std_disp_digit);
			addColumnPathMap(DtlR.$amt_disp_digit, BaseR.$amt_disp_digit);
			addColumnPathMap(DtlR.$unit_disp_digit, BaseR.$unit_disp_digit);
			addColumnPathMap(DtlR.$rate_disp_digit, BaseR.$rate_disp_digit);
			addColumnPathMap(DtlR.$excel_pln_flg, BaseR.$excel_pln_flg);
			addColumnPathMap(DtlR.$excel_act_flg, BaseR.$excel_act_flg);
			addColumnPathMap(DtlR.$excel_alc_flg, BaseR.$excel_alc_flg);
			addColumnPathMap(DtlR.$ins_usr_id, BaseR.$ins_usr_id);
			addColumnPathMap(DtlR.$ins_usr_nm, BaseR.$ins_usr_nm);
			addColumnPathMap(DtlR.$ins_ts, BaseR.$ins_ts);
			addColumnPathMap(DtlR.$ins_func_id, BaseR.$ins_func_id);
			addColumnPathMap(DtlR.$ins_func_nm, BaseR.$ins_func_nm);
			addColumnPathMap(DtlR.$upd_cntr, BaseR.$upd_cntr);
			addColumnPathMap(DtlR.$upd_usr_id, BaseR.$upd_usr_id);
			addColumnPathMap(DtlR.$upd_usr_nm, BaseR.$upd_usr_nm);
			addColumnPathMap(DtlR.$upd_ts, BaseR.$upd_ts);
			addColumnPathMap(DtlR.$upd_func_id, BaseR.$upd_func_id);
			addColumnPathMap(DtlR.$upd_func_nm, BaseR.$upd_func_nm);
			addColumnPathMap(DtlR.$upd_srv_req_no, BaseR.$upd_srv_req_no);
			addColumnPathMap(DtlR.$wg_non_mov_flg, BaseR.$wg_non_mov_flg);
			addColumnPathMap(DtlR.$lot_non_mov_flg, BaseR.$lot_non_mov_flg);
			addColumnPathMap(DtlR.$sublot_non_mov_flg, BaseR.$sublot_non_mov_flg);
			addColumnPathMap(DtlR.$sno1_non_mov_flg, BaseR.$sno1_non_mov_flg);
			addColumnPathMap(DtlR.$sno2_non_mov_flg, BaseR.$sno2_non_mov_flg);
			addColumnPathMap(DtlR.$sno3_non_mov_flg, BaseR.$sno3_non_mov_flg);
			addColumnPathMap(DtlR.$sno4_non_mov_flg, BaseR.$sno4_non_mov_flg);
			addColumnPathMap(DtlR.$act_trd_calc_ctg_cd, BaseR.$act_trd_calc_ctg_cd);
			addColumnPathMap(DtlR.$act_trd_calc_ctg_nm, BaseR.$act_trd_calc_ctg_nm);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			super.valueCopy(dest, src);
			
			if (!isStatusNone(getBaseR())) {
				dest.check(true);
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBaseR().clearAll();
		if (getStatus() == REF) {
			setREFStatus();
		}
		else {
			setFIXStatus();
		}
	}

	protected void setStatus() {
		setDefaultMode(BasePanel);
	}

	//  イベント  //////////////////////////////////////////////////////////////
	@Override
	public void doBase_non_prod_flg_NC(MCEventInfo info) {
		super.doBase_non_sls_flg_NC(info);
		setOperFlgStatus();
		
	}

	protected void setOperFlgStatus() {
		if (getBaseR().non_prod_flg()) {
			Base_oper_sum_flg.setValue(false);
			Base_oper_sum_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Base_oper_sum_flg);
		}
	}
	@Override
	public void doBase_non_sls_flg_NC(MCEventInfo info) {
		super.doBase_non_sls_flg_NC(info);
		setAsstAndStkBpFlgStatus();
	}

	protected void setAsstAndStkBpFlgStatus() {
		if (getBaseR().non_sls_flg()) {
			Base_asst_flg.setValue(false);
			Base_stk_bp_flg.setValue(false);
			Base_asst_flg.setMode(MCMode.READ_ONLY);
			Base_stk_bp_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Base_asst_flg);
			setDefaultMode(Base_stk_bp_flg);
		}
	}
	
	/**
	 * 小数部有効桁数のチェック
	 */
	@Override
	public boolean doBase_std_dec_place_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doBase_std_dec_place_VC(info);
	}
	@Override
	public boolean doBase_amt_dec_place_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doBase_amt_dec_place_VC(info);
	}
	@Override
	public boolean doBase_ave_dec_place_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doBase_ave_dec_place_VC(info);
	}
	// 小数部有効桁数のチェック
	protected boolean isDecPlace(MCNumber n){
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}
	
	// セッティング ////////////////////////////////////////////////////////////
	@Override
	protected void valueInit(){
		super.valueInit();
		getCndR().co_cd(getCoCd());
		getCndR().co_nm(getCo().co_nm());
		getCndR().this_term(getTerm(this));
		addDoBehind(Cnd_srch);
	}
	protected boolean checkAllTableClear() {
		return ((getBaseR().isStatusNone()) || confirmRegDataClear());
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getBaseR().clearAll();
	}

}