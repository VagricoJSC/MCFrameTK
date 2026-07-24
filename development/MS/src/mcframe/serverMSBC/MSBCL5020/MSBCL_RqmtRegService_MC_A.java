package mcframe.serverMSBC.MSBCL5020;

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
 * "MSBCL_RqmtRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_RqmtRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_RqmtRegService.Rqmt_Sprt01 aRqmt_Sprt01;

	protected void initRqmt_Sprt01() {
		this.info = PDef.MS_MSBCL5020_Rqmt_Sprt01_INFO;
		this.aRqmt_Sprt01 = ((MSBCL_RqmtRegService)this).new Rqmt_Sprt01();
	}

	public static MSBCL_RqmtRegService.Rqmt_Sprt01 crtRqmt_Sprt01() {
		MSBCL_RqmtRegService lgc = new MSBCL_RqmtRegService();
		lgc.initRqmt_Sprt01();
		return lgc.aRqmt_Sprt01;
	}

	protected void paramRqmt_Sprt01(MCParam p) {
		if (this.aRqmt_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRqmt_Sprt01.up0());
		p.addUpBlock(aRqmt_Sprt01.up1());
		p.addDownBlock(aRqmt_Sprt01.down0());
	}

	protected void doRqmt_Sprt01() {
		aRqmt_Sprt01.call();
	};

	/**
	 * Rqmt_Sprt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR createRqmt_Sprt01_RsltR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.create();
	}

	/**
	 * Rqmt_Sprt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> createRqmt_Sprt01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.class);
	}

	/**
	 * Rqmt_Sprt01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR createRqmt_Sprt01_CtrlR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR.create();
	}
	protected MSBCL_RqmtRegService.Rqmt_Chk01 aRqmt_Chk01;

	protected void initRqmt_Chk01() {
		this.info = PDef.MS_MSBCL5020_Rqmt_Chk01_INFO;
		this.aRqmt_Chk01 = ((MSBCL_RqmtRegService)this).new Rqmt_Chk01();
	}

	public static MSBCL_RqmtRegService.Rqmt_Chk01 crtRqmt_Chk01() {
		MSBCL_RqmtRegService lgc = new MSBCL_RqmtRegService();
		lgc.initRqmt_Chk01();
		return lgc.aRqmt_Chk01;
	}

	protected void paramRqmt_Chk01(MCParam p) {
		if (this.aRqmt_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRqmt_Chk01.up0());
		p.addUpBlock(aRqmt_Chk01.up1());
		p.addDownBlock(aRqmt_Chk01.down0());
	}

	protected void doRqmt_Chk01() {
		aRqmt_Chk01.call();
	};

	/**
	 * Rqmt_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR createRqmt_Chk01_RsltR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.create();
	}

	/**
	 * Rqmt_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> createRqmt_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
	}

	/**
	 * Rqmt_Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR createRqmt_Chk01_CtrlR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR.create();
	}

	/**
	 * Rqmt_Chk01_ItmDtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR createRqmt_Chk01_ItmDtlWkR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR.create();
	}
	protected MSBCL_RqmtRegService.Rqmt_Upd01 aRqmt_Upd01;

	protected void initRqmt_Upd01() {
		this.info = PDef.MS_MSBCL5020_Rqmt_Upd01_INFO;
		this.aRqmt_Upd01 = ((MSBCL_RqmtRegService)this).new Rqmt_Upd01();
	}

	public static MSBCL_RqmtRegService.Rqmt_Upd01 crtRqmt_Upd01() {
		MSBCL_RqmtRegService lgc = new MSBCL_RqmtRegService();
		lgc.initRqmt_Upd01();
		return lgc.aRqmt_Upd01;
	}

	protected void paramRqmt_Upd01(MCParam p) {
		if (this.aRqmt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRqmt_Upd01.up0());
		p.addDownBlock(aRqmt_Upd01.down0());
	}

	protected void doRqmt_Upd01() {
		aRqmt_Upd01.call();
	};

	/**
	 * Rqmt_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR createRqmt_Upd01_RsltR(){
		return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.create();
	}

	/**
	 * Rqmt_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> createRqmt_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Rqmt_Sprt01オペレーション.<p>
	 *
	 */
	abstract public class Rqmt_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rqmt_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Rqmt_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Rqmt_Sprt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR createRqmt_Sprt01_RsltR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.create();
		}

		/**
		 * Rqmt_Sprt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> createRqmt_Sprt01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR.class);
		}

		/**
		 * Rqmt_Sprt01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR createRqmt_Sprt01_CtrlR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno1_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno1_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_keep_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Sprt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this).info;
		}


	}
	/**
	 * Rqmt_Chk01オペレーション.<p>
	 *
	 */
	abstract public class Rqmt_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rqmt_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> down0;
		/** [Rqmt_Chk01_ItmDtlWk]ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR aRqmt_Chk01_ItmDtlWk;
		
		
		// コンストラクタ
		protected Rqmt_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
			aRqmt_Chk01_ItmDtlWk = mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Rqmt_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR createRqmt_Chk01_RsltR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.create();
		}

		/**
		 * Rqmt_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> createRqmt_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
		}

		/**
		 * Rqmt_Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR createRqmt_Chk01_CtrlR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR.create();
		}

		/**
		 * Rqmt_Chk01_ItmDtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR createRqmt_Chk01_ItmDtlWkR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR.create();
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
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqmt_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>no_dac_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_gnrt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Rqmt_Chk01_ItmDtlWk]ブロックのコンテナaRqmt_Chk01_ItmDtlWkRを返します。
		 *
		 * @return Rqmt_Chk01_ItmDtlWkR
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_ItmDtlWkR Rqmt_Chk01_ItmDtlWk() {
			return aRqmt_Chk01_ItmDtlWk;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this).info;
		}


	}
	/**
	 * Rqmt_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Rqmt_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rqmt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Rqmt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);

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
			invoke((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Rqmt_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR createRqmt_Upd01_RsltR(){
			return mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.create();
		}

		/**
		 * Rqmt_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> createRqmt_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR.class);
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
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqmt_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5020.Rqmt_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_RqmtRegService)MSBCL_RqmtRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}