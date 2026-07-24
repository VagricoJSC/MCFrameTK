package mcframe.serverMSBE.MSBEL5720;

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
 * "MSBEL_ExRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ExRptService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5720";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ExRptService.ExRpt_Prnt01 aExRpt_Prnt01;

	protected void initExRpt_Prnt01() {
		this.info = PDef.MS_MSBEL5720_ExRpt_Prnt01_INFO;
		this.aExRpt_Prnt01 = ((MSBEL_ExRptService)this).new ExRpt_Prnt01();
	}

	public static MSBEL_ExRptService.ExRpt_Prnt01 crtExRpt_Prnt01() {
		MSBEL_ExRptService lgc = new MSBEL_ExRptService();
		lgc.initExRpt_Prnt01();
		return lgc.aExRpt_Prnt01;
	}

	protected void paramExRpt_Prnt01(MCParam p) {
		if (this.aExRpt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExRpt_Prnt01.up0());
		p.addUpBlock(aExRpt_Prnt01.up1());
		p.addDownBlock(aExRpt_Prnt01.down0());
	}

	protected void doExRpt_Prnt01() {
		aExRpt_Prnt01.call();
	};

	/**
	 * ExRpt_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR createExRpt_Prnt01_CndR(){
		return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.create();
	}

	/**
	 * ExRpt_Prnt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> createExRpt_Prnt01_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.class);
	}

	/**
	 * ExRpt_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR createExRpt_Prnt01_HdrR(){
		return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR.create();
	}
	protected MSBEL_ExRptService.ExRpt_Prnt02 aExRpt_Prnt02;

	protected void initExRpt_Prnt02() {
		this.info = PDef.MS_MSBEL5720_ExRpt_Prnt02_INFO;
		this.aExRpt_Prnt02 = ((MSBEL_ExRptService)this).new ExRpt_Prnt02();
	}

	public static MSBEL_ExRptService.ExRpt_Prnt02 crtExRpt_Prnt02() {
		MSBEL_ExRptService lgc = new MSBEL_ExRptService();
		lgc.initExRpt_Prnt02();
		return lgc.aExRpt_Prnt02;
	}

	protected void paramExRpt_Prnt02(MCParam p) {
		if (this.aExRpt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExRpt_Prnt02.up0());
		p.addUpBlock(aExRpt_Prnt02.up1());
		p.addDownBlock(aExRpt_Prnt02.down0());
	}

	protected void doExRpt_Prnt02() {
		aExRpt_Prnt02.call();
	};

	/**
	 * ExRpt_Prnt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR createExRpt_Prnt02_CndR(){
		return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.create();
	}

	/**
	 * ExRpt_Prnt02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> createExRpt_Prnt02_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.class);
	}

	/**
	 * ExRpt_Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR createExRpt_Prnt02_HdrR(){
		return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR.create();
	}
	protected MSBEL_ExRptService.ExRpt_Prnt03 aExRpt_Prnt03;

	protected void initExRpt_Prnt03() {
		this.info = PDef.MS_MSBEL5720_ExRpt_Prnt03_INFO;
		this.aExRpt_Prnt03 = ((MSBEL_ExRptService)this).new ExRpt_Prnt03();
	}

	public static MSBEL_ExRptService.ExRpt_Prnt03 crtExRpt_Prnt03() {
		MSBEL_ExRptService lgc = new MSBEL_ExRptService();
		lgc.initExRpt_Prnt03();
		return lgc.aExRpt_Prnt03;
	}

	protected void paramExRpt_Prnt03(MCParam p) {
		if (this.aExRpt_Prnt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExRpt_Prnt03.up0());
		p.addDownBlock(aExRpt_Prnt03.down0());
	}

	protected void doExRpt_Prnt03() {
		aExRpt_Prnt03.call();
	};
	protected MSBEL_ExRptService.ExRpt_Prnt04 aExRpt_Prnt04;

	protected void initExRpt_Prnt04() {
		this.info = PDef.MS_MSBEL5720_ExRpt_Prnt04_INFO;
		this.aExRpt_Prnt04 = ((MSBEL_ExRptService)this).new ExRpt_Prnt04();
	}

	public static MSBEL_ExRptService.ExRpt_Prnt04 crtExRpt_Prnt04() {
		MSBEL_ExRptService lgc = new MSBEL_ExRptService();
		lgc.initExRpt_Prnt04();
		return lgc.aExRpt_Prnt04;
	}

	protected void paramExRpt_Prnt04(MCParam p) {
		if (this.aExRpt_Prnt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExRpt_Prnt04.up0());
		p.addDownBlock(aExRpt_Prnt04.down0());
	}

	protected void doExRpt_Prnt04() {
		aExRpt_Prnt04.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ExRpt_Prnt01オペレーション.<p>
	 *
	 * インボイスを印刷する（複数印刷用）<br>
	 */
	abstract public class ExRpt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExRpt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> down0;
		
		
		// コンストラクタ
		protected ExRpt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.class);
			up1 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.class);

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
			invoke((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExRpt_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR createExRpt_Prnt01_CndR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.create();
		}

		/**
		 * ExRpt_Prnt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> createExRpt_Prnt01_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.class);
		}

		/**
		 * ExRpt_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR createExRpt_Prnt01_HdrR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> up0() {
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
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this).info;
		}


	}
	/**
	 * ExRpt_Prnt02オペレーション.<p>
	 *
	 * パッキングリストを印刷する（複数印刷用）<br>
	 */
	abstract public class ExRpt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExRpt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> down0;
		
		
		// コンストラクタ
		protected ExRpt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.class);
			up1 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.class);

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
			invoke((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExRpt_Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR createExRpt_Prnt02_CndR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.create();
		}

		/**
		 * ExRpt_Prnt02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> createExRpt_Prnt02_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.class);
		}

		/**
		 * ExRpt_Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR createExRpt_Prnt02_HdrR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> up0() {
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
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this).info;
		}


	}
	/**
	 * ExRpt_Prnt03オペレーション.<p>
	 *
	 * インボイスを印刷する（単票印刷用）<br>
	 */
	abstract public class ExRpt_Prnt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExRpt_Prnt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR down0;
		
		
		// コンストラクタ
		protected ExRpt_Prnt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.create();

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
			invoke((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExRpt_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR createExRpt_Prnt01_CndR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this).info;
		}


	}
	/**
	 * ExRpt_Prnt04オペレーション.<p>
	 *
	 * パッキングリストを印刷する（単票印刷用）<br>
	 */
	abstract public class ExRpt_Prnt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExRpt_Prnt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR down0;
		
		
		// コンストラクタ
		protected ExRpt_Prnt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.create();

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
			invoke((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExRpt_Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR createExRpt_Prnt02_CndR(){
			return mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR
		 */
		public mcframe.serverMSBE.MSBEL5720.ExRpt_Prnt02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExRptService)MSBEL_ExRptService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}