package mcframe.serverMSBF.MSBFL5220;

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
 * "MSBFL_LotInhService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_LotInhService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_LotInhService.LotInh_Upd01 aLotInh_Upd01;

	protected void initLotInh_Upd01() {
		this.info = PDef.MS_MSBFL5220_LotInh_Upd01_INFO;
		this.aLotInh_Upd01 = ((MSBFL_LotInhService)this).new LotInh_Upd01();
	}

	public static MSBFL_LotInhService.LotInh_Upd01 crtLotInh_Upd01() {
		MSBFL_LotInhService lgc = new MSBFL_LotInhService();
		lgc.initLotInh_Upd01();
		return lgc.aLotInh_Upd01;
	}

	protected void paramLotInh_Upd01(MCParam p) {
		if (this.aLotInh_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInh_Upd01.up0());
		p.addUpBlock(aLotInh_Upd01.up1());
		p.addDownBlock(aLotInh_Upd01.down0());
	}

	protected void doLotInh_Upd01() {
		aLotInh_Upd01.call();
	};

	/**
	 * LotInh_Upd01_Cnd01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R createLotInh_Upd01_Cnd01R(){
		return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.create();
	}

	/**
	 * LotInh_Upd01_Cnd01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> createLotInh_Upd01_Cnd01L(){
		return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.class);
	}

	/**
	 * LotInh_Upd01_Cnd02ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R createLotInh_Upd01_Cnd02R(){
		return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R.create();
	}

	/**
	 * LotInh_Upd01_Cnd02ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R> createLotInh_Upd01_Cnd02L(){
		return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R.class);
	}

	/**
	 * LotInh_Upd01_Dtl01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R createLotInh_Upd01_Dtl01R(){
		return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R.create();
	}
	protected MSBFL_LotInhService.LotInh_Upd02 aLotInh_Upd02;

	protected void initLotInh_Upd02() {
		this.info = PDef.MS_MSBFL5220_LotInh_Upd02_INFO;
		this.aLotInh_Upd02 = ((MSBFL_LotInhService)this).new LotInh_Upd02();
	}

	public static MSBFL_LotInhService.LotInh_Upd02 crtLotInh_Upd02() {
		MSBFL_LotInhService lgc = new MSBFL_LotInhService();
		lgc.initLotInh_Upd02();
		return lgc.aLotInh_Upd02;
	}

	protected void paramLotInh_Upd02(MCParam p) {
		if (this.aLotInh_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInh_Upd02.up0());
		p.addDownBlock(aLotInh_Upd02.down0());
	}

	protected void doLotInh_Upd02() {
		aLotInh_Upd02.call();
	};

	/**
	 * LotInh_Upd02_Cnd01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R createLotInh_Upd02_Cnd01R(){
		return mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.create();
	}

	/**
	 * LotInh_Upd02_Cnd01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> createLotInh_Upd02_Cnd01L(){
		return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.class);
	}
	protected MSBFL_LotInhService.LotInh_Upd03 aLotInh_Upd03;

	protected void initLotInh_Upd03() {
		this.info = PDef.MS_MSBFL5220_LotInh_Upd03_INFO;
		this.aLotInh_Upd03 = ((MSBFL_LotInhService)this).new LotInh_Upd03();
	}

	public static MSBFL_LotInhService.LotInh_Upd03 crtLotInh_Upd03() {
		MSBFL_LotInhService lgc = new MSBFL_LotInhService();
		lgc.initLotInh_Upd03();
		return lgc.aLotInh_Upd03;
	}

	protected void paramLotInh_Upd03(MCParam p) {
		if (this.aLotInh_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInh_Upd03.up0());
		p.addDownBlock(aLotInh_Upd03.down0());
	}

	protected void doLotInh_Upd03() {
		aLotInh_Upd03.call();
	};

	/**
	 * LotInh_Upd03_Cnd01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R createLotInh_Upd03_Cnd01R(){
		return mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.create();
	}

	/**
	 * LotInh_Upd03_Cnd01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> createLotInh_Upd03_Cnd01L(){
		return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * LotInh_Upd01オペレーション.<p>
	 *
	 * ロット継承サービスを実行する。<br>
	 */
	abstract public class LotInh_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInh_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> down0;
		/** [LotInh_Upd01_Dtl01]ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R aLotInh_Upd01_Dtl01;
		
		
		// コンストラクタ
		protected LotInh_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.class);
			aLotInh_Upd01_Dtl01 = mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R.create();

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
			invoke((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotInh_Upd01_Cnd01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R createLotInh_Upd01_Cnd01R(){
			return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.create();
		}

		/**
		 * LotInh_Upd01_Cnd01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> createLotInh_Upd01_Cnd01L(){
			return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R.class);
		}

		/**
		 * LotInh_Upd01_Cnd02ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R createLotInh_Upd01_Cnd02R(){
			return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R.create();
		}

		/**
		 * LotInh_Upd01_Cnd02ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R> createLotInh_Upd01_Cnd02L(){
			return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R.class);
		}

		/**
		 * LotInh_Upd01_Dtl01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R createLotInh_Upd01_Dtl01R(){
			return mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>silent_flg</td></tr>
		 * 	<tr><td><br></td><td>no_exception_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R> up1() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R> down0() {
			return down0;
		}


		/**
		 * [LotInh_Upd01_Dtl01]ブロックのコンテナaLotInh_Upd01_Dtl01Rを返します。
		 *
		 * @return LotInh_Upd01_Dtl01R
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Dtl01R LotInh_Upd01_Dtl01() {
			return aLotInh_Upd01_Dtl01;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this).info;
		}


	}
	/**
	 * LotInh_Upd02オペレーション.<p>
	 *
	 * 品目製造指図ＮＯを指定し、ロット継承サービスを実行する。<br>
	 */
	abstract public class LotInh_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInh_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> down0;
		
		
		// コンストラクタ
		protected LotInh_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.class);

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
			invoke((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotInh_Upd02_Cnd01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R createLotInh_Upd02_Cnd01R(){
			return mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.create();
		}

		/**
		 * LotInh_Upd02_Cnd01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> createLotInh_Upd02_Cnd01L(){
			return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>silent_flg</td></tr>
		 * 	<tr><td><br></td><td>no_exception_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this).info;
		}


	}
	/**
	 * LotInh_Upd03オペレーション.<p>
	 *
	 * 製造実績ＮＯを指定し、ロット継承サービスを実行する。<br>
	 */
	abstract public class LotInh_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInh_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> down0;
		
		
		// コンストラクタ
		protected LotInh_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.class);

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
			invoke((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotInh_Upd03_Cnd01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R createLotInh_Upd03_Cnd01R(){
			return mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.create();
		}

		/**
		 * LotInh_Upd03_Cnd01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> createLotInh_Upd03_Cnd01L(){
			return MCList.create(mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>silent_flg</td></tr>
		 * 	<tr><td><br></td><td>no_exception_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotInhService)MSBFL_LotInhService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}