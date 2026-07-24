package mcframe.serverMSBD.MSBDL5300;

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
 * "MSBDL_PurcSlipSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcSlipSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5300";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd01 aPurcSlipSendIf_Upd01;

	protected void initPurcSlipSendIf_Upd01() {
		this.info = PDef.MS_MSBDL5300_PurcSlipSendIf_Upd01_INFO;
		this.aPurcSlipSendIf_Upd01 = ((MSBDL_PurcSlipSendIfService)this).new PurcSlipSendIf_Upd01();
	}

	public static MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd01 crtPurcSlipSendIf_Upd01() {
		MSBDL_PurcSlipSendIfService lgc = new MSBDL_PurcSlipSendIfService();
		lgc.initPurcSlipSendIf_Upd01();
		return lgc.aPurcSlipSendIf_Upd01;
	}

	protected void paramPurcSlipSendIf_Upd01(MCParam p) {
		if (this.aPurcSlipSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSlipSendIf_Upd01.up0());
	}

	protected void doPurcSlipSendIf_Upd01() {
		aPurcSlipSendIf_Upd01.call();
	};

	/**
	 * PurcSlipSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR createPurcSlipSendIf_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR.create();
	}

	/**
	 * PurcSlipSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR> createPurcSlipSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR.class);
	}
	protected MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd02 aPurcSlipSendIf_Upd02;

	protected void initPurcSlipSendIf_Upd02() {
		this.info = PDef.MS_MSBDL5300_PurcSlipSendIf_Upd02_INFO;
		this.aPurcSlipSendIf_Upd02 = ((MSBDL_PurcSlipSendIfService)this).new PurcSlipSendIf_Upd02();
	}

	public static MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd02 crtPurcSlipSendIf_Upd02() {
		MSBDL_PurcSlipSendIfService lgc = new MSBDL_PurcSlipSendIfService();
		lgc.initPurcSlipSendIf_Upd02();
		return lgc.aPurcSlipSendIf_Upd02;
	}

	protected void paramPurcSlipSendIf_Upd02(MCParam p) {
		if (this.aPurcSlipSendIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSlipSendIf_Upd02.up0());
	}

	protected void doPurcSlipSendIf_Upd02() {
		aPurcSlipSendIf_Upd02.call();
	};

	/**
	 * PurcSlipSendIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR createPurcSlipSendIf_Upd02_DtlR(){
		return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR.create();
	}

	/**
	 * PurcSlipSendIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR> createPurcSlipSendIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR.class);
	}
	protected MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd03 aPurcSlipSendIf_Upd03;

	protected void initPurcSlipSendIf_Upd03() {
		this.info = PDef.MS_MSBDL5300_PurcSlipSendIf_Upd03_INFO;
		this.aPurcSlipSendIf_Upd03 = ((MSBDL_PurcSlipSendIfService)this).new PurcSlipSendIf_Upd03();
	}

	public static MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd03 crtPurcSlipSendIf_Upd03() {
		MSBDL_PurcSlipSendIfService lgc = new MSBDL_PurcSlipSendIfService();
		lgc.initPurcSlipSendIf_Upd03();
		return lgc.aPurcSlipSendIf_Upd03;
	}

	protected void paramPurcSlipSendIf_Upd03(MCParam p) {
		if (this.aPurcSlipSendIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSlipSendIf_Upd03.up0());
	}

	protected void doPurcSlipSendIf_Upd03() {
		aPurcSlipSendIf_Upd03.call();
	};

	/**
	 * PurcSlipSendIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR createPurcSlipSendIf_Upd03_DtlR(){
		return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR.create();
	}

	/**
	 * PurcSlipSendIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR> createPurcSlipSendIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR.class);
	}
	protected MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd04 aPurcSlipSendIf_Upd04;

	protected void initPurcSlipSendIf_Upd04() {
		this.info = PDef.MS_MSBDL5300_PurcSlipSendIf_Upd04_INFO;
		this.aPurcSlipSendIf_Upd04 = ((MSBDL_PurcSlipSendIfService)this).new PurcSlipSendIf_Upd04();
	}

	public static MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd04 crtPurcSlipSendIf_Upd04() {
		MSBDL_PurcSlipSendIfService lgc = new MSBDL_PurcSlipSendIfService();
		lgc.initPurcSlipSendIf_Upd04();
		return lgc.aPurcSlipSendIf_Upd04;
	}

	protected void paramPurcSlipSendIf_Upd04(MCParam p) {
		if (this.aPurcSlipSendIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doPurcSlipSendIf_Upd04() {
		aPurcSlipSendIf_Upd04.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcSlipSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の仕入伝票をＩＦテーブルに書き込み、送信する<br>
	 */
	abstract public class PurcSlipSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSlipSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected PurcSlipSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR.class);

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
			invoke((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcSlipSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR createPurcSlipSendIf_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR.create();
		}

		/**
		 * PurcSlipSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR> createPurcSlipSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * PurcSlipSendIf_Upd02オペレーション.<p>
	 *
	 * 仕入伝票を再送信する<br>
	 */
	abstract public class PurcSlipSendIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSlipSendIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR> up0;
		
		
		// コンストラクタ
		protected PurcSlipSendIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR.class);

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
			invoke((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcSlipSendIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR createPurcSlipSendIf_Upd02_DtlR(){
			return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR.create();
		}

		/**
		 * PurcSlipSendIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR> createPurcSlipSendIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * PurcSlipSendIf_Upd03オペレーション.<p>
	 *
	 * 仕入伝票を送信対象外にする<br>
	 */
	abstract public class PurcSlipSendIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSlipSendIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected PurcSlipSendIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR.class);

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
			invoke((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcSlipSendIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR createPurcSlipSendIf_Upd03_DtlR(){
			return mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR.create();
		}

		/**
		 * PurcSlipSendIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR> createPurcSlipSendIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>not_snd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5300.PurcSlipSendIf_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * PurcSlipSendIf_Upd04オペレーション.<p>
	 *
	 * 仕入伝票を送信する<br>
	 */
	abstract public class PurcSlipSendIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSlipSendIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected PurcSlipSendIf_Upd04() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSlipSendIfService)MSBDL_PurcSlipSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}