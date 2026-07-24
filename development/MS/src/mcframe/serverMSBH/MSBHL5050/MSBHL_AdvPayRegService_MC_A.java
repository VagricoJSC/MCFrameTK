package mcframe.serverMSBH.MSBHL5050;

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
 * "MSBHL_AdvPayRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_AdvPayRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_AdvPayRegService.AdvPay_Chk01 aAdvPay_Chk01;

	protected void initAdvPay_Chk01() {
		this.info = PDef.MS_MSBHL5050_AdvPay_Chk01_INFO;
		this.aAdvPay_Chk01 = ((MSBHL_AdvPayRegService)this).new AdvPay_Chk01();
	}

	public static MSBHL_AdvPayRegService.AdvPay_Chk01 crtAdvPay_Chk01() {
		MSBHL_AdvPayRegService lgc = new MSBHL_AdvPayRegService();
		lgc.initAdvPay_Chk01();
		return lgc.aAdvPay_Chk01;
	}

	protected void paramAdvPay_Chk01(MCParam p) {
		if (this.aAdvPay_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAdvPay_Chk01.up0());
		p.addDownBlock(aAdvPay_Chk01.down0());
	}

	protected void doAdvPay_Chk01() {
		aAdvPay_Chk01.call();
	};

	/**
	 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
		return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
	}

	/**
	 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
	}
	protected MSBHL_AdvPayRegService.AdvPay_Chk02 aAdvPay_Chk02;

	protected void initAdvPay_Chk02() {
		this.info = PDef.MS_MSBHL5050_AdvPay_Chk02_INFO;
		this.aAdvPay_Chk02 = ((MSBHL_AdvPayRegService)this).new AdvPay_Chk02();
	}

	public static MSBHL_AdvPayRegService.AdvPay_Chk02 crtAdvPay_Chk02() {
		MSBHL_AdvPayRegService lgc = new MSBHL_AdvPayRegService();
		lgc.initAdvPay_Chk02();
		return lgc.aAdvPay_Chk02;
	}

	protected void paramAdvPay_Chk02(MCParam p) {
		if (this.aAdvPay_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAdvPay_Chk02.up0());
		p.addDownBlock(aAdvPay_Chk02.down0());
	}

	protected void doAdvPay_Chk02() {
		aAdvPay_Chk02.call();
	};
	protected MSBHL_AdvPayRegService.AdvPay_Ins01 aAdvPay_Ins01;

	protected void initAdvPay_Ins01() {
		this.info = PDef.MS_MSBHL5050_AdvPay_Ins01_INFO;
		this.aAdvPay_Ins01 = ((MSBHL_AdvPayRegService)this).new AdvPay_Ins01();
	}

	public static MSBHL_AdvPayRegService.AdvPay_Ins01 crtAdvPay_Ins01() {
		MSBHL_AdvPayRegService lgc = new MSBHL_AdvPayRegService();
		lgc.initAdvPay_Ins01();
		return lgc.aAdvPay_Ins01;
	}

	protected void paramAdvPay_Ins01(MCParam p) {
		if (this.aAdvPay_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAdvPay_Ins01.up0());
		p.addDownBlock(aAdvPay_Ins01.down0());
	}

	protected void doAdvPay_Ins01() {
		aAdvPay_Ins01.call();
	};
	protected MSBHL_AdvPayRegService.AdvPay_Upd01 aAdvPay_Upd01;

	protected void initAdvPay_Upd01() {
		this.info = PDef.MS_MSBHL5050_AdvPay_Upd01_INFO;
		this.aAdvPay_Upd01 = ((MSBHL_AdvPayRegService)this).new AdvPay_Upd01();
	}

	public static MSBHL_AdvPayRegService.AdvPay_Upd01 crtAdvPay_Upd01() {
		MSBHL_AdvPayRegService lgc = new MSBHL_AdvPayRegService();
		lgc.initAdvPay_Upd01();
		return lgc.aAdvPay_Upd01;
	}

	protected void paramAdvPay_Upd01(MCParam p) {
		if (this.aAdvPay_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAdvPay_Upd01.up0());
		p.addDownBlock(aAdvPay_Upd01.down0());
	}

	protected void doAdvPay_Upd01() {
		aAdvPay_Upd01.call();
	};
	protected MSBHL_AdvPayRegService.AdvPay_Del01 aAdvPay_Del01;

	protected void initAdvPay_Del01() {
		this.info = PDef.MS_MSBHL5050_AdvPay_Del01_INFO;
		this.aAdvPay_Del01 = ((MSBHL_AdvPayRegService)this).new AdvPay_Del01();
	}

	public static MSBHL_AdvPayRegService.AdvPay_Del01 crtAdvPay_Del01() {
		MSBHL_AdvPayRegService lgc = new MSBHL_AdvPayRegService();
		lgc.initAdvPay_Del01();
		return lgc.aAdvPay_Del01;
	}

	protected void paramAdvPay_Del01(MCParam p) {
		if (this.aAdvPay_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAdvPay_Del01.up0());
	}

	protected void doAdvPay_Del01() {
		aAdvPay_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AdvPay_Chk01オペレーション.<p>
	 *
	 * 前渡金の登録・更新が可能かチェックをする。<br>
	 */
	abstract public class AdvPay_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AdvPay_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected AdvPay_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);

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
			invoke((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		/**
		 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>note_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this).info;
		}


	}
	/**
	 * AdvPay_Chk02オペレーション.<p>
	 *
	 * 前渡金の削除が可能かチェックをする。<br>
	 */
	abstract public class AdvPay_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AdvPay_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected AdvPay_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);

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
			invoke((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		/**
		 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pn.pay_note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this).info;
		}


	}
	/**
	 * AdvPay_Ins01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を登録する。<br>
	 */
	abstract public class AdvPay_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AdvPay_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected AdvPay_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);

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
			invoke((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		/**
		 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this).info;
		}


	}
	/**
	 * AdvPay_Upd01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を更新する。<br>
	 */
	abstract public class AdvPay_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AdvPay_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected AdvPay_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);

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
			invoke((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		/**
		 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>note_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this).info;
		}


	}
	/**
	 * AdvPay_Del01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を削除する。<br>
	 */
	abstract public class AdvPay_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AdvPay_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0;
		
		
		// コンストラクタ
		protected AdvPay_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AdvPay_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createAdvPay_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		/**
		 * AdvPay_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> createAdvPay_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pn.pay_note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayRegService)MSBHL_AdvPayRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}