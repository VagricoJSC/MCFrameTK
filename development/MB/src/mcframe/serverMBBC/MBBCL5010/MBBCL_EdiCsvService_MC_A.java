package mcframe.serverMBBC.MBBCL5010;

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
 * "MBBCL_EdiCsvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCL_EdiCsvService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBCL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBCL_EdiCsvService.EdiCsv_Chk01 aEdiCsv_Chk01;

	protected void initEdiCsv_Chk01() {
		this.info = PDef.MB_MBBCL5010_EdiCsv_Chk01_INFO;
		this.aEdiCsv_Chk01 = ((MBBCL_EdiCsvService)this).new EdiCsv_Chk01();
	}

	public static MBBCL_EdiCsvService.EdiCsv_Chk01 crtEdiCsv_Chk01() {
		MBBCL_EdiCsvService lgc = new MBBCL_EdiCsvService();
		lgc.initEdiCsv_Chk01();
		return lgc.aEdiCsv_Chk01;
	}

	protected void paramEdiCsv_Chk01(MCParam p) {
		if (this.aEdiCsv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEdiCsv_Chk01.up0());
		p.addUpBlock(aEdiCsv_Chk01.up1());
		p.addDownBlock(aEdiCsv_Chk01.down0());
		p.addDownBlock(aEdiCsv_Chk01.down1());
	}

	protected void doEdiCsv_Chk01() {
		aEdiCsv_Chk01.call();
	};

	/**
	 * EdiCsv_Chk01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R createEdiCsv_Chk01_Dtl1R(){
		return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.create();
	}

	/**
	 * EdiCsv_Chk01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> createEdiCsv_Chk01_Dtl1L(){
		return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
	}

	/**
	 * EdiCsv_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R createEdiCsv_Chk01_Dtl2R(){
		return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.create();
	}

	/**
	 * EdiCsv_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> createEdiCsv_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);
	}
	protected MBBCL_EdiCsvService.EdiCsv_Prnt01 aEdiCsv_Prnt01;

	protected void initEdiCsv_Prnt01() {
		this.info = PDef.MB_MBBCL5010_EdiCsv_Prnt01_INFO;
		this.aEdiCsv_Prnt01 = ((MBBCL_EdiCsvService)this).new EdiCsv_Prnt01();
	}

	public static MBBCL_EdiCsvService.EdiCsv_Prnt01 crtEdiCsv_Prnt01() {
		MBBCL_EdiCsvService lgc = new MBBCL_EdiCsvService();
		lgc.initEdiCsv_Prnt01();
		return lgc.aEdiCsv_Prnt01;
	}

	protected void paramEdiCsv_Prnt01(MCParam p) {
		if (this.aEdiCsv_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEdiCsv_Prnt01.up0());
		p.addUpBlock(aEdiCsv_Prnt01.up1());
	}

	protected void doEdiCsv_Prnt01() {
		aEdiCsv_Prnt01.call();
	};

	/**
	 * EdiCsv_Prnt01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R createEdiCsv_Prnt01_Dtl1R(){
		return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.create();
	}

	/**
	 * EdiCsv_Prnt01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> createEdiCsv_Prnt01_Dtl1L(){
		return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
	}

	/**
	 * EdiCsv_Prnt01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R createEdiCsv_Prnt01_Dtl2R(){
		return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.create();
	}

	/**
	 * EdiCsv_Prnt01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> createEdiCsv_Prnt01_Dtl2L(){
		return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * EdiCsv_Chk01オペレーション.<p>
	 *
	 * ＥＤＩ用ＣＳＶファイル作成前チェック<br>
	 */
	abstract public class EdiCsv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EdiCsv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> down1;
		
		
		// コンストラクタ
		protected EdiCsv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);

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
			invoke((MBBCL_EdiCsvService)MBBCL_EdiCsvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * EdiCsv_Chk01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R createEdiCsv_Chk01_Dtl1R(){
			return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.create();
		}

		/**
		 * EdiCsv_Chk01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> createEdiCsv_Chk01_Dtl1L(){
			return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
		}

		/**
		 * EdiCsv_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R createEdiCsv_Chk01_Dtl2R(){
			return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.create();
		}

		/**
		 * EdiCsv_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> createEdiCsv_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_EdiCsvService)MBBCL_EdiCsvService_MC_A.this).info;
		}


	}
	/**
	 * EdiCsv_Prnt01オペレーション.<p>
	 *
	 * ＥＤＩ用ＣＳＶファイルを作成する<br>
	 */
	abstract public class EdiCsv_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EdiCsv_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> up1;
		
		
		// コンストラクタ
		protected EdiCsv_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);

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
			invoke((MBBCL_EdiCsvService)MBBCL_EdiCsvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * EdiCsv_Prnt01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R createEdiCsv_Prnt01_Dtl1R(){
			return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.create();
		}

		/**
		 * EdiCsv_Prnt01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> createEdiCsv_Prnt01_Dtl1L(){
			return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R.class);
		}

		/**
		 * EdiCsv_Prnt01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R createEdiCsv_Prnt01_Dtl2R(){
			return mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.create();
		}

		/**
		 * EdiCsv_Prnt01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> createEdiCsv_Prnt01_Dtl2L(){
			return MCList.create(mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5010.EdiCsv_Chk01_Dtl2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_EdiCsvService)MBBCL_EdiCsvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}