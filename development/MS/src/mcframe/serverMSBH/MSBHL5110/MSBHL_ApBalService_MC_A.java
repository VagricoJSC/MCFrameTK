package mcframe.serverMSBH.MSBHL5110;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBHL_ApBalService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApBalService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApBalService.ApBal_Srch01 aApBal_Srch01;

	protected void initApBal_Srch01() {
		this.info = PDef.MS_MSBHL5110_ApBal_Srch01_INFO;
		this.aApBal_Srch01 = ((MSBHL_ApBalService)this).new ApBal_Srch01();
	}

	public static MSBHL_ApBalService.ApBal_Srch01 crtApBal_Srch01() {
		MSBHL_ApBalService lgc = new MSBHL_ApBalService();
		lgc.initApBal_Srch01();
		return lgc.aApBal_Srch01;
	}

	protected void paramApBal_Srch01(MCParam p) {
		if (this.aApBal_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApBal_Srch01.up0());
		p.addDownBlock(aApBal_Srch01.down0());
	}

	protected void doApBal_Srch01() {
		aApBal_Srch01.call();
	};

	/**
	 * ApBal_Srch01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR createApBal_Srch01_CtrlR(){
		return mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR.create();
	}

	/**
	 * ApBal_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR createApBal_Srch01_RsltR(){
		return mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR.create();
	}

	/**
	 * ApBal_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR> createApBal_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApBal_Srch01オペレーション.<p>
	 *
	 * 買掛金の残高情報を検索する<br>
	 */
	abstract public class ApBal_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApBal_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected ApBal_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApBalService)MSBHL_ApBalService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApBal_Srch01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR createApBal_Srch01_CtrlR(){
			return mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR.create();
		}

		/**
		 * ApBal_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR createApBal_Srch01_RsltR(){
			return mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR.create();
		}

		/**
		 * ApBal_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR> createApBal_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmpl_nm_flg</td></tr>
		 * 	<tr><td><br></td><td>close_flg</td></tr>
		 * 	<tr><td><br></td><td>group_ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>group_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>group_asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>group_purc_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>group_rcpt_iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>group_rcpt_iv_mng_no_flg</td></tr>
		 * 	<tr><td><br></td><td>group_trd_cur_flg</td></tr>
		 * 	<tr><td><br></td><td>group_wrk_no_flg</td></tr>
		 * 	<tr><td><br></td><td>group_ap_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>group_ap_cred_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_to</td></tr>
		 * 	<tr><td><br></td><td>chk_dac_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR
		 */
		public mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_CtrlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>init_bal</td></tr>
		 * 	<tr><td><br></td><td>purc_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cash_amt</td></tr>
		 * 	<tr><td><br></td><td>note_amt</td></tr>
		 * 	<tr><td><br></td><td>account_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>end_bal</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_init_bal</td></tr>
		 * 	<tr><td><br></td><td>base_cur_purc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cash_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_note_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_account_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_sw_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_end_bal</td></tr>
		 * 	<tr><td><br></td><td>exc_gain_loss</td></tr>
		 * 	<tr><td><br></td><td>total_exc_gain_loss</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5110.ApBal_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApBalService)MSBHL_ApBalService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}