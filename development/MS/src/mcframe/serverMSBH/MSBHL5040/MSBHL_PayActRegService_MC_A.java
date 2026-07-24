package mcframe.serverMSBH.MSBHL5040;

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
 * "MSBHL_PayActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PayActRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PayActRegService.PayAct_Chk01 aPayAct_Chk01;

	protected void initPayAct_Chk01() {
		this.info = PDef.MS_MSBHL5040_PayAct_Chk01_INFO;
		this.aPayAct_Chk01 = ((MSBHL_PayActRegService)this).new PayAct_Chk01();
	}

	public static MSBHL_PayActRegService.PayAct_Chk01 crtPayAct_Chk01() {
		MSBHL_PayActRegService lgc = new MSBHL_PayActRegService();
		lgc.initPayAct_Chk01();
		return lgc.aPayAct_Chk01;
	}

	protected void paramPayAct_Chk01(MCParam p) {
		if (this.aPayAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPayAct_Chk01.up0());
		p.addUpBlock(aPayAct_Chk01.up1());
		p.addDownBlock(aPayAct_Chk01.down0());
		p.addDownBlock(aPayAct_Chk01.down1());
	}

	protected void doPayAct_Chk01() {
		aPayAct_Chk01.call();
	};

	/**
	 * PayAct_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createPayAct_Chk01_HdrR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
	}

	/**
	 * PayAct_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> createPayAct_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
	}

	/**
	 * PayAct_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createPayAct_Chk01_DtlR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
	}

	/**
	 * PayAct_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createPayAct_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
	}
	protected MSBHL_PayActRegService.PayAct_Upd01 aPayAct_Upd01;

	protected void initPayAct_Upd01() {
		this.info = PDef.MS_MSBHL5040_PayAct_Upd01_INFO;
		this.aPayAct_Upd01 = ((MSBHL_PayActRegService)this).new PayAct_Upd01();
	}

	public static MSBHL_PayActRegService.PayAct_Upd01 crtPayAct_Upd01() {
		MSBHL_PayActRegService lgc = new MSBHL_PayActRegService();
		lgc.initPayAct_Upd01();
		return lgc.aPayAct_Upd01;
	}

	protected void paramPayAct_Upd01(MCParam p) {
		if (this.aPayAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPayAct_Upd01.up0());
		p.addUpBlock(aPayAct_Upd01.up1());
		p.addDownBlock(aPayAct_Upd01.down0());
		p.addDownBlock(aPayAct_Upd01.down1());
	}

	protected void doPayAct_Upd01() {
		aPayAct_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PayAct_Chk01オペレーション.<p>
	 *
	 * 支払実績の登録・更新・削除が可能かチェックをする。<br>
	 */
	abstract public class PayAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PayAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected PayAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PayActRegService)MSBHL_PayActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PayAct_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createPayAct_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
		}

		/**
		 * PayAct_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> createPayAct_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
		}

		/**
		 * PayAct_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createPayAct_Chk01_DtlR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
		}

		/**
		 * PayAct_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createPayAct_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pa.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.schd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_chng_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_not_calc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pa.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.schd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.pay_note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.note_amt</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.rcv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_not_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActRegService)MSBHL_PayActRegService_MC_A.this).info;
		}


	}
	/**
	 * PayAct_Upd01オペレーション.<p>
	 *
	 * 支払実績を登録・更新・削除する。関連するテーブルを更新する。<br>
	 */
	abstract public class PayAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PayAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected PayAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PayActRegService)MSBHL_PayActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PayAct_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createPayAct_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
		}

		/**
		 * PayAct_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> createPayAct_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.class);
		}

		/**
		 * PayAct_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createPayAct_Chk01_DtlR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
		}

		/**
		 * PayAct_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createPayAct_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pa.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.schd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.par_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.pay_note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.rcv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.par_pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_not_calc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActRegService)MSBHL_PayActRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}