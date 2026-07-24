package mcframe.serverMSBH.MSBHL0050;

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
 * "MSBHL_PaySchdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PaySchdSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PaySchdSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0050_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PaySchdSrch)this).new Srch01();
	}

	public static MSBHL_PaySchdSrch.Srch01 crtSrch01() {
		MSBHL_PaySchdSrch lgc = new MSBHL_PaySchdSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0050.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0050.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);
	}
	protected MSBHL_PaySchdSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBHL0050_Srch02_INFO;
		this.aSrch02 = ((MSBHL_PaySchdSrch)this).new Srch02();
	}

	public static MSBHL_PaySchdSrch.Srch02 crtSrch02() {
		MSBHL_PaySchdSrch lgc = new MSBHL_PaySchdSrch();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0050.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0050.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBH.MSBHL0050.Srch02_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0050.Srch02_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch02_RsltR.class);
	}
	protected MSBHL_PaySchdSrch.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBHL0050_Prnt01_INFO;
		this.aPrnt01 = ((MSBHL_PaySchdSrch)this).new Prnt01();
	}

	public static MSBHL_PaySchdSrch.Prnt01 crtPrnt01() {
		MSBHL_PaySchdSrch lgc = new MSBHL_PaySchdSrch();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0050.Srch01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払予定を検索する（支払照合ヘッダ単位）<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0050.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);

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
			invoke((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>last_rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>excld_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>rfrnc_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0050.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_amt</td></tr>
		 * 	<tr><td><br></td><td>not_appl_bal</td></tr>
		 * 	<tr><td><br></td><td>delay</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払予定を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0050.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0050.Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0050.Srch02_RsltR.class);

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
			invoke((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBH.MSBHL0050.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBH.MSBHL0050.Srch02_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch02_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>last_rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>excld_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>rfrnc_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>setoff_info_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate_flg</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_bill_no_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>note_info_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0050.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>exc_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_exc_com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
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
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 支払予定表を発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);

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
			invoke((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0050.Srch01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0050.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0050.Srch01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdSrch)MSBHL_PaySchdSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}