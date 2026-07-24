package mcframe.serverMBBE.MBBEL0090;

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
 * "MBBEL_BulkImpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_BulkImpReg_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String LOGIC_ID = "MBBEL0090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_BulkImpReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBEL0090_Srch01_INFO;
		this.aSrch01 = ((MBBEL_BulkImpReg)this).new Srch01();
	}

	public static MBBEL_BulkImpReg.Srch01 crtSrch01() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
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
	public mcframe.serverMBBE.MBBEL0090.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBE.MBBEL0090.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBE.MBBEL0090.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Srch01_RsltR.class);
	}
	protected MBBEL_BulkImpReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MB_MBBEL0090_Upd01_INFO;
		this.aUpd01 = ((MBBEL_BulkImpReg)this).new Upd01();
	}

	public static MBBEL_BulkImpReg.Upd01 crtUpd01() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd01_DtlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
	}

	/**
	 * Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd01_CtrlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
	}
	protected MBBEL_BulkImpReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MB_MBBEL0090_Upd02_INFO;
		this.aUpd02 = ((MBBEL_BulkImpReg)this).new Upd02();
	}

	public static MBBEL_BulkImpReg.Upd02 crtUpd02() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addUpBlock(aUpd02.up1());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd02_DtlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
	}

	/**
	 * Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
	}

	/**
	 * Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd02_CtrlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
	}
	protected MBBEL_BulkImpReg.Upd03 aUpd03;

	protected void initUpd03() {
		this.info = PDef.MB_MBBEL0090_Upd03_INFO;
		this.aUpd03 = ((MBBEL_BulkImpReg)this).new Upd03();
	}

	public static MBBEL_BulkImpReg.Upd03 crtUpd03() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
		lgc.initUpd03();
		return lgc.aUpd03;
	}

	protected void paramUpd03(MCParam p) {
		if (this.aUpd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd03.up0());
		p.addUpBlock(aUpd03.up1());
		p.addDownBlock(aUpd03.down0());
	}

	protected void doUpd03() {
		aUpd03.call();
	};

	/**
	 * Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd03_DtlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
	}

	/**
	 * Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd03_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
	}

	/**
	 * Upd03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd03_CtrlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
	}
	protected MBBEL_BulkImpReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MB_MBBEL0090_Prnt01_INFO;
		this.aPrnt01 = ((MBBEL_BulkImpReg)this).new Prnt01();
	}

	public static MBBEL_BulkImpReg.Prnt01 crtPrnt01() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createPrnt01_DtlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
	}

	/**
	 * Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createPrnt01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
	}

	/**
	 * Prnt01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createPrnt01_CtrlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
	}
	protected MBBEL_BulkImpReg.Prnt02 aPrnt02;

	protected void initPrnt02() {
		this.info = PDef.MB_MBBEL0090_Prnt02_INFO;
		this.aPrnt02 = ((MBBEL_BulkImpReg)this).new Prnt02();
	}

	public static MBBEL_BulkImpReg.Prnt02 crtPrnt02() {
		MBBEL_BulkImpReg lgc = new MBBEL_BulkImpReg();
		lgc.initPrnt02();
		return lgc.aPrnt02;
	}

	protected void paramPrnt02(MCParam p) {
		if (this.aPrnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt02.up0());
		p.addUpBlock(aPrnt02.up1());
	}

	protected void doPrnt02() {
		aPrnt02.call();
	};

	/**
	 * Prnt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createPrnt02_DtlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
	}

	/**
	 * Prnt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createPrnt02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
	}

	/**
	 * Prnt02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createPrnt02_CtrlR(){
		return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * まとめ登録実行管理情報を検索する<br>
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
		private final mcframe.serverMBBE.MBBEL0090.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0090.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Srch01_RsltR.class);

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
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBE.MBBEL0090.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBE.MBBEL0090.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_ctg</td></tr>
		 * 	<tr><td><br></td><td>table_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>table_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0090.Srch01_CndR
		 */
		public mcframe.serverMBBE.MBBEL0090.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_ctg</td></tr>
		 * 	<tr><td><br></td><td>table_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>table_ctg_seq</td></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>table_nm</td></tr>
		 * 	<tr><td><br></td><td>table_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * まとめ登録を実行する<br>
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
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd01_DtlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
		}

		/**
		 * Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd01_CtrlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>file_dat</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * 	<tr><td><br></td><td>remake_flg</td></tr>
		 * 	<tr><td><br></td><td>crud_flg</td></tr>
		 * 	<tr><td><br></td><td>err_continue_flg</td></tr>
		 * 	<tr><td><br></td><td>fmt_typ</td></tr>
		 * 	<tr><td><br></td><td>data_start_row</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * まとめ登録（チェックのみ）を実行する<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd02_DtlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
		}

		/**
		 * Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
		}

		/**
		 * Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd02_CtrlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>file_dat</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * 	<tr><td><br></td><td>remake_flg</td></tr>
		 * 	<tr><td><br></td><td>crud_flg</td></tr>
		 * 	<tr><td><br></td><td>err_continue_flg</td></tr>
		 * 	<tr><td><br></td><td>fmt_typ</td></tr>
		 * 	<tr><td><br></td><td>data_start_row</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * まとめ登録処理を実行する<br>
	 */
	abstract public class Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);

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
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createUpd03_DtlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
		}

		/**
		 * Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createUpd03_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
		}

		/**
		 * Upd03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createUpd03_CtrlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_ctg</td></tr>
		 * 	<tr><td><br></td><td>table_ctg_seq</td></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>table_seq</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>db_class_path</td></tr>
		 * 	<tr><td><br></td><td>chk_ope</td></tr>
		 * 	<tr><td><br></td><td>upd_ope</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>chk_only_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * 	<tr><td><br></td><td>remake_flg</td></tr>
		 * 	<tr><td><br></td><td>crud_flg</td></tr>
		 * 	<tr><td><br></td><td>err_continue_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fmt</td></tr>
		 * 	<tr><td><br></td><td>ts_fmt</td></tr>
		 * 	<tr><td><br></td><td>data_start_row</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>fin_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * フォーマットファイルを出力する<br>
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
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> down0;
		/** [Prnt01_Ctrl]ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR aPrnt01_Ctrl;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			aPrnt01_Ctrl = mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();

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
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createPrnt01_DtlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
		}

		/**
		 * Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createPrnt01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
		}

		/**
		 * Prnt01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createPrnt01_CtrlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> down0() {
			return down0;
		}


		/**
		 * [Prnt01_Ctrl]ブロックのコンテナaPrnt01_CtrlRを返します。
		 *
		 * @return Prnt01_CtrlR
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR Prnt01_Ctrl() {
			return aPrnt01_Ctrl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * データファイルを出力する<br>
	 */
	abstract public class Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1;
		
		
		// コンストラクタ
		protected Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_DtlR createPrnt02_DtlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.create();
		}

		/**
		 * Prnt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> createPrnt02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0090.Upd01_DtlR.class);
		}

		/**
		 * Prnt02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR createPrnt02_CtrlR(){
			return mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>table_id</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0090.Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fmt_typ</td></tr>
		 * 	<tr><td><br></td><td>data_start_row</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR
		 */
		public mcframe.serverMBBE.MBBEL0090.Upd01_CtrlR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BulkImpReg)MBBEL_BulkImpReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}