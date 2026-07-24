package mcframe.serverMSBG.MSBGL0280;

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
 * "MSBGL_CredDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_CredDtlSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL0280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_CredDtlSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBGL0280_Srch01_INFO;
		this.aSrch01 = ((MSBGL_CredDtlSrch)this).new Srch01();
	}

	public static MSBGL_CredDtlSrch.Srch01 crtSrch01() {
		MSBGL_CredDtlSrch lgc = new MSBGL_CredDtlSrch();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0280.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBG.MSBGL0280.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR createSrch01_HdrRsltR(){
		return mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR.create();
	}

	/**
	 * Srch01_DtlRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR createSrch01_DtlRsltR(){
		return mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR.create();
	}

	/**
	 * Srch01_DtlRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR> createSrch01_DtlRsltL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR.class);
	}

	/**
	 * Srch01_DtlApRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR createSrch01_DtlApRsltR(){
		return mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR.create();
	}

	/**
	 * Srch01_DtlApRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR> createSrch01_DtlApRsltL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 特定の与信管理先の与信状況の詳細を検索する。<br>
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
		private final mcframe.serverMSBG.MSBGL0280.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0280.Srch01_CndR.create();
			down0 = mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR.create();
			down1 = MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_CredDtlSrch)MSBGL_CredDtlSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBG.MSBGL0280.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR createSrch01_HdrRsltR(){
			return mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR.create();
		}

		/**
		 * Srch01_DtlRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR createSrch01_DtlRsltR(){
			return mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR.create();
		}

		/**
		 * Srch01_DtlRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR> createSrch01_DtlRsltL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR.class);
		}

		/**
		 * Srch01_DtlApRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR createSrch01_DtlApRsltR(){
			return mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR.create();
		}

		/**
		 * Srch01_DtlApRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR> createSrch01_DtlApRsltL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0280.Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cred_limit</td></tr>
		 * 	<tr><td><br></td><td>ttl_cred_amt</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>ttl_ym</td></tr>
		 * 	<tr><td><br></td><td>ttl_ym_ap</td></tr>
		 * 	<tr><td><br></td><td>ttl_end_bal</td></tr>
		 * 	<tr><td><br></td><td>ttl_init_bal</td></tr>
		 * 	<tr><td><br></td><td>ttl_sls</td></tr>
		 * 	<tr><td><br></td><td>ttl_rcv</td></tr>
		 * 	<tr><td><br></td><td>ttl_adv</td></tr>
		 * 	<tr><td><br></td><td>ttl_init_bal_ap</td></tr>
		 * 	<tr><td><br></td><td>ttl_purc</td></tr>
		 * 	<tr><td><br></td><td>ttl_pay</td></tr>
		 * 	<tr><td><br></td><td>ttl_adv_pay</td></tr>
		 * 	<tr><td><br></td><td>not_appl_note</td></tr>
		 * 	<tr><td><br></td><td>not_appl_adv_note</td></tr>
		 * 	<tr><td><br></td><td>ttl_backord</td></tr>
		 * 	<tr><td><br></td><td>ttl_qtn</td></tr>
		 * 	<tr><td><br></td><td>ttl_po_backord</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR
		 */
		public mcframe.serverMSBG.MSBGL0280.Srch01_HdrRsltR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>init_bal</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>cash_amt</td></tr>
		 * 	<tr><td><br></td><td>note_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>end_bal</td></tr>
		 * 	<tr><td><br></td><td>not_appl_note</td></tr>
		 * 	<tr><td><br></td><td>backord_amt</td></tr>
		 * 	<tr><td><br></td><td>cred_amt</td></tr>
		 * 	<tr><td><br></td><td>qtn_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlRsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>init_bal</td></tr>
		 * 	<tr><td><br></td><td>purc_amt</td></tr>
		 * 	<tr><td><br></td><td>cash_amt</td></tr>
		 * 	<tr><td><br></td><td>note_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>end_bal</td></tr>
		 * 	<tr><td><br></td><td>backord_amt</td></tr>
		 * 	<tr><td><br></td><td>cred_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0280.Srch01_DtlApRsltR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_CredDtlSrch)MSBGL_CredDtlSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}