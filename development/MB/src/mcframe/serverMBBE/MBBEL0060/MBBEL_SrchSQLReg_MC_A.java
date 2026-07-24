package mcframe.serverMBBE.MBBEL0060;

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
 * "MBBEL_SrchSQLReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_SrchSQLReg_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_SrchSQLReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBEL0060_Srch01_INFO;
		this.aSrch01 = ((MBBEL_SrchSQLReg)this).new Srch01();
	}

	public static MBBEL_SrchSQLReg.Srch01 crtSrch01() {
		MBBEL_SrchSQLReg lgc = new MBBEL_SrchSQLReg();
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
	public mcframe.serverMBBE.MBBEL0060.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltBaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR createSrch01_RsltBaseR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR.create();
	}

	/**
	 * Srch01_RsltSqlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR createSrch01_RsltSqlR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
	}

	/**
	 * Srch01_RsltBindブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createSrch01_RsltBindR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
	}

	/**
	 * Srch01_RsltBindブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createSrch01_RsltBindL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
	}
	protected MBBEL_SrchSQLReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MB_MBBEL0060_Srch02_INFO;
		this.aSrch02 = ((MBBEL_SrchSQLReg)this).new Srch02();
	}

	public static MBBEL_SrchSQLReg.Srch02 crtSrch02() {
		MBBEL_SrchSQLReg lgc = new MBBEL_SrchSQLReg();
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
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR createSrch02_CndR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
	}

	/**
	 * Srch02_RsltBindブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createSrch02_RsltBindR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
	}

	/**
	 * Srch02_RsltBindブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createSrch02_RsltBindL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
	}
	protected MBBEL_SrchSQLReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MB_MBBEL0060_Ins01_INFO;
		this.aIns01 = ((MBBEL_SrchSQLReg)this).new Ins01();
	}

	public static MBBEL_SrchSQLReg.Ins01 crtIns01() {
		MBBEL_SrchSQLReg lgc = new MBBEL_SrchSQLReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addDownBlock(aIns01.down0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createIns01_BaseR(){
		return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
	}

	/**
	 * Ins01_SqlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR createIns01_SqlR(){
		return mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
	}

	/**
	 * Ins01_RsltBindブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createIns01_RsltBindR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
	}

	/**
	 * Ins01_RsltBindブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createIns01_RsltBindL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
	}
	protected MBBEL_SrchSQLReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MB_MBBEL0060_Upd01_INFO;
		this.aUpd01 = ((MBBEL_SrchSQLReg)this).new Upd01();
	}

	public static MBBEL_SrchSQLReg.Upd01 crtUpd01() {
		MBBEL_SrchSQLReg lgc = new MBBEL_SrchSQLReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createUpd01_BaseR(){
		return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
	}

	/**
	 * Upd01_SqlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR createUpd01_SqlR(){
		return mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
	}

	/**
	 * Upd01_RsltBindブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createUpd01_RsltBindR(){
		return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
	}

	/**
	 * Upd01_RsltBindブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createUpd01_RsltBindL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
	}
	protected MBBEL_SrchSQLReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MB_MBBEL0060_Del01_INFO;
		this.aDel01 = ((MBBEL_SrchSQLReg)this).new Del01();
	}

	public static MBBEL_SrchSQLReg.Del01 crtDel01() {
		MBBEL_SrchSQLReg lgc = new MBBEL_SrchSQLReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createDel01_BaseR(){
		return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を検索<br>
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
		private final mcframe.serverMBBE.MBBEL0060.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0060.Srch01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR.create();
			down1 = mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
			down2 = MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);

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
			invoke((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this);
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
		public mcframe.serverMBBE.MBBEL0060.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltBaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR createSrch01_RsltBaseR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR.create();
		}

		/**
		 * Srch01_RsltSqlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR createSrch01_RsltSqlR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
		}

		/**
		 * Srch01_RsltBindブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createSrch01_RsltBindR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
		}

		/**
		 * Srch01_RsltBindブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createSrch01_RsltBindL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Srch01_CndR
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>logic_id</td></tr>
		 * 	<tr><td><br></td><td>func_actyp</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>form_file_nm</td></tr>
		 * 	<tr><td><br></td><td>cartridge</td></tr>
		 * 	<tr><td><br></td><td>cartridge_nm</td></tr>
		 * 	<tr><td><br></td><td>print_flg</td></tr>
		 * 	<tr><td><br></td><td>dwnld_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBaseR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sql_src</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cond_col</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * バインド変数取得<br>
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
		private final mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);

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
			invoke((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR createSrch02_CndR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR.create();
		}

		/**
		 * Srch02_RsltBindブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createSrch02_RsltBindR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
		}

		/**
		 * Srch02_RsltBindブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createSrch02_RsltBindL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sql_src</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltSqlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cond_col</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 業務データダウンロード管理に新規登録<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Ins01_SqlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
			up1 = mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);

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
			invoke((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createIns01_BaseR(){
			return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
		}

		/**
		 * Ins01_SqlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR createIns01_SqlR(){
			return mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
		}

		/**
		 * Ins01_RsltBindブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createIns01_RsltBindR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
		}

		/**
		 * Ins01_RsltBindブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createIns01_RsltBindL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>logic_id</td></tr>
		 * 	<tr><td><br></td><td>func_actyp</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>form_file_nm</td></tr>
		 * 	<tr><td><br></td><td>cartridge</td></tr>
		 * 	<tr><td><br></td><td>print_flg</td></tr>
		 * 	<tr><td><br></td><td>dwnld_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Ins01_BaseR
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sql_src</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Ins01_SqlR
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cond_col</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を更新<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Ins01_SqlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
			up1 = mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);

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
			invoke((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createUpd01_BaseR(){
			return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
		}

		/**
		 * Upd01_SqlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR createUpd01_SqlR(){
			return mcframe.serverMBBE.MBBEL0060.Ins01_SqlR.create();
		}

		/**
		 * Upd01_RsltBindブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR createUpd01_RsltBindR(){
			return mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.create();
		}

		/**
		 * Upd01_RsltBindブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> createUpd01_RsltBindL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>logic_id</td></tr>
		 * 	<tr><td><br></td><td>func_actyp</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>form_file_nm</td></tr>
		 * 	<tr><td><br></td><td>cartridge</td></tr>
		 * 	<tr><td><br></td><td>print_flg</td></tr>
		 * 	<tr><td><br></td><td>dwnld_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Ins01_BaseR
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sql_src</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Ins01_SqlR
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_SqlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cond_col</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0060.Srch01_RsltBindR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を更新<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();

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
			invoke((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR createDel01_BaseR(){
			return mcframe.serverMBBE.MBBEL0060.Ins01_BaseR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0060.Ins01_BaseR
		 */
		public mcframe.serverMBBE.MBBEL0060.Ins01_BaseR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SrchSQLReg)MBBEL_SrchSQLReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}