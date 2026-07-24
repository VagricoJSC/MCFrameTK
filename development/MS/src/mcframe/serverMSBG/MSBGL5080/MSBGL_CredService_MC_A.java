package mcframe.serverMSBG.MSBGL5080;

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
 * "MSBGL_CredService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_CredService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL5080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_CredService.Cred_Srch01 aCred_Srch01;

	protected void initCred_Srch01() {
		this.info = PDef.MS_MSBGL5080_Cred_Srch01_INFO;
		this.aCred_Srch01 = ((MSBGL_CredService)this).new Cred_Srch01();
	}

	public static MSBGL_CredService.Cred_Srch01 crtCred_Srch01() {
		MSBGL_CredService lgc = new MSBGL_CredService();
		lgc.initCred_Srch01();
		return lgc.aCred_Srch01;
	}

	protected void paramCred_Srch01(MCParam p) {
		if (this.aCred_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCred_Srch01.up0());
		p.addDownBlock(aCred_Srch01.down0());
	}

	protected void doCred_Srch01() {
		aCred_Srch01.call();
	};

	/**
	 * Cred_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR createCred_Srch01_CndR(){
		return mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR.create();
	}
	protected MSBGL_CredService.Cred_Upd01 aCred_Upd01;

	protected void initCred_Upd01() {
		this.info = PDef.MS_MSBGL5080_Cred_Upd01_INFO;
		this.aCred_Upd01 = ((MSBGL_CredService)this).new Cred_Upd01();
	}

	public static MSBGL_CredService.Cred_Upd01 crtCred_Upd01() {
		MSBGL_CredService lgc = new MSBGL_CredService();
		lgc.initCred_Upd01();
		return lgc.aCred_Upd01;
	}

	protected void paramCred_Upd01(MCParam p) {
		if (this.aCred_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCred_Upd01.up0());
		p.addDownBlock(aCred_Upd01.down0());
		p.addDownBlock(aCred_Upd01.down1());
	}

	protected void doCred_Upd01() {
		aCred_Upd01.call();
	};

	/**
	 * Cred_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR createCred_Upd01_CndR(){
		return mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.create();
	}

	/**
	 * Cred_Upd01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> createCred_Upd01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.class);
	}

	/**
	 * Cred_Upd01_ErrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR createCred_Upd01_ErrR(){
		return mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR.create();
	}

	/**
	 * Cred_Upd01_ErrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR> createCred_Upd01_ErrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR.class);
	}
	protected MSBGL_CredService.Cred_Upd02 aCred_Upd02;

	protected void initCred_Upd02() {
		this.info = PDef.MS_MSBGL5080_Cred_Upd02_INFO;
		this.aCred_Upd02 = ((MSBGL_CredService)this).new Cred_Upd02();
	}

	public static MSBGL_CredService.Cred_Upd02 crtCred_Upd02() {
		MSBGL_CredService lgc = new MSBGL_CredService();
		lgc.initCred_Upd02();
		return lgc.aCred_Upd02;
	}

	protected void paramCred_Upd02(MCParam p) {
		if (this.aCred_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCred_Upd02.up0());
		p.addDownBlock(aCred_Upd02.down0());
	}

	protected void doCred_Upd02() {
		aCred_Upd02.call();
	};

	/**
	 * Cred_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR createCred_Upd02_CndR(){
		return mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.create();
	}

	/**
	 * Cred_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> createCred_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Cred_Srch01オペレーション.<p>
	 *
	 */
	abstract public class Cred_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cred_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR down0;
		
		
		// コンストラクタ
		protected Cred_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR.create();
			down0 = mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR.create();

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
			invoke((MSBGL_CredService)MSBGL_CredService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Cred_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR createCred_Srch01_CndR(){
			return mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>cur_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_amt</td></tr>
		 * 	<tr><td><br></td><td>cred_limit</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Srch01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_CredService)MSBGL_CredService_MC_A.this).info;
		}


	}
	/**
	 * Cred_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Cred_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cred_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR> down1;
		
		
		// コンストラクタ
		protected Cred_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.class);
			down1 = MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_CredService)MSBGL_CredService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Cred_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR createCred_Upd01_CndR(){
			return mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.create();
		}

		/**
		 * Cred_Upd01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> createCred_Upd01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR.class);
		}

		/**
		 * Cred_Upd01_ErrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR createCred_Upd01_ErrR(){
			return mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR.create();
		}

		/**
		 * Cred_Upd01_ErrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR> createCred_Upd01_ErrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>cur_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>trd_ptn_typ</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>amt</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>cred_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_amt</td></tr>
		 * 	<tr><td><br></td><td>cred_limit</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd01_ErrR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_CredService)MSBGL_CredService_MC_A.this).info;
		}


	}
	/**
	 * Cred_Upd02オペレーション.<p>
	 *
	 */
	abstract public class Cred_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cred_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> down0;
		
		
		// コンストラクタ
		protected Cred_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.class);

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
			invoke((MSBGL_CredService)MSBGL_CredService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Cred_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR createCred_Upd02_CndR(){
			return mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.create();
		}

		/**
		 * Cred_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> createCred_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>cur_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_CredService)MSBGL_CredService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}