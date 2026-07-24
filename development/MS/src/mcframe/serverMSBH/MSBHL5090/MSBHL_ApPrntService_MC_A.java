package mcframe.serverMSBH.MSBHL5090;

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
 * "MSBHL_ApPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApPrntService.ApPrnt_Prnt01 aApPrnt_Prnt01;

	protected void initApPrnt_Prnt01() {
		this.info = PDef.MS_MSBHL5090_ApPrnt_Prnt01_INFO;
		this.aApPrnt_Prnt01 = ((MSBHL_ApPrntService)this).new ApPrnt_Prnt01();
	}

	public static MSBHL_ApPrntService.ApPrnt_Prnt01 crtApPrnt_Prnt01() {
		MSBHL_ApPrntService lgc = new MSBHL_ApPrntService();
		lgc.initApPrnt_Prnt01();
		return lgc.aApPrnt_Prnt01;
	}

	protected void paramApPrnt_Prnt01(MCParam p) {
		if (this.aApPrnt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApPrnt_Prnt01.up0());
		p.addDownBlock(aApPrnt_Prnt01.down0());
	}

	protected void doApPrnt_Prnt01() {
		aApPrnt_Prnt01.call();
	};

	/**
	 * ApPrnt_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR createApPrnt_Prnt01_HdrR(){
		return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.create();
	}

	/**
	 * ApPrnt_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> createApPrnt_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.class);
	}
	protected MSBHL_ApPrntService.ApPrnt_Prnt02 aApPrnt_Prnt02;

	protected void initApPrnt_Prnt02() {
		this.info = PDef.MS_MSBHL5090_ApPrnt_Prnt02_INFO;
		this.aApPrnt_Prnt02 = ((MSBHL_ApPrntService)this).new ApPrnt_Prnt02();
	}

	public static MSBHL_ApPrntService.ApPrnt_Prnt02 crtApPrnt_Prnt02() {
		MSBHL_ApPrntService lgc = new MSBHL_ApPrntService();
		lgc.initApPrnt_Prnt02();
		return lgc.aApPrnt_Prnt02;
	}

	protected void paramApPrnt_Prnt02(MCParam p) {
		if (this.aApPrnt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApPrnt_Prnt02.up0());
		p.addDownBlock(aApPrnt_Prnt02.down0());
	}

	protected void doApPrnt_Prnt02() {
		aApPrnt_Prnt02.call();
	};

	/**
	 * ApPrnt_Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR createApPrnt_Prnt02_HdrR(){
		return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.create();
	}

	/**
	 * ApPrnt_Prnt02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> createApPrnt_Prnt02_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.class);
	}
	protected MSBHL_ApPrntService.ApPrnt_Prnt03 aApPrnt_Prnt03;

	protected void initApPrnt_Prnt03() {
		this.info = PDef.MS_MSBHL5090_ApPrnt_Prnt03_INFO;
		this.aApPrnt_Prnt03 = ((MSBHL_ApPrntService)this).new ApPrnt_Prnt03();
	}

	public static MSBHL_ApPrntService.ApPrnt_Prnt03 crtApPrnt_Prnt03() {
		MSBHL_ApPrntService lgc = new MSBHL_ApPrntService();
		lgc.initApPrnt_Prnt03();
		return lgc.aApPrnt_Prnt03;
	}

	protected void paramApPrnt_Prnt03(MCParam p) {
		if (this.aApPrnt_Prnt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApPrnt_Prnt03.up0());
		p.addUpBlock(aApPrnt_Prnt03.up1());
		p.addDownBlock(aApPrnt_Prnt03.down0());
	}

	protected void doApPrnt_Prnt03() {
		aApPrnt_Prnt03.call();
	};

	/**
	 * ApPrnt_Prnt03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR createApPrnt_Prnt03_HdrR(){
		return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.create();
	}

	/**
	 * ApPrnt_Prnt03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> createApPrnt_Prnt03_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.class);
	}

	/**
	 * ApPrnt_Prnt03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR createApPrnt_Prnt03_CndR(){
		return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApPrnt_Prnt01オペレーション.<p>
	 *
	 * 支払予定表を発行します。<br>
	 */
	abstract public class ApPrnt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApPrnt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> down0;
		
		
		// コンストラクタ
		protected ApPrnt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.class);

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
			invoke((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApPrnt_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR createApPrnt_Prnt01_HdrR(){
			return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.create();
		}

		/**
		 * ApPrnt_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> createApPrnt_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR.class);
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
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this).info;
		}


	}
	/**
	 * ApPrnt_Prnt02オペレーション.<p>
	 *
	 * 支払予定表を発行します。<br>
	 */
	abstract public class ApPrnt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApPrnt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> down0;
		
		
		// コンストラクタ
		protected ApPrnt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.class);

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
			invoke((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApPrnt_Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR createApPrnt_Prnt02_HdrR(){
			return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.create();
		}

		/**
		 * ApPrnt_Prnt02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> createApPrnt_Prnt02_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this).info;
		}


	}
	/**
	 * ApPrnt_Prnt03オペレーション.<p>
	 *
	 * 支払通知書を発行します。<br>
	 */
	abstract public class ApPrnt_Prnt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApPrnt_Prnt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> down0;
		
		
		// コンストラクタ
		protected ApPrnt_Prnt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.class);
			up1 = mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.class);

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
			invoke((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApPrnt_Prnt03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR createApPrnt_Prnt03_HdrR(){
			return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.create();
		}

		/**
		 * ApPrnt_Prnt03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> createApPrnt_Prnt03_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR.class);
		}

		/**
		 * ApPrnt_Prnt03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR createApPrnt_Prnt03_CndR(){
			return mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR
		 */
		public mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5090.ApPrnt_Prnt03_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApPrntService)MSBHL_ApPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}