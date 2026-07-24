package mcframe.serverMSBF.MSBFL0020;

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
 * "MSBFL_PrcdLotInspReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_PrcdLotInspReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_PrcdLotInspReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBFL0020_Srch01_INFO;
		this.aSrch01 = ((MSBFL_PrcdLotInspReg)this).new Srch01();
	}

	public static MSBFL_PrcdLotInspReg.Srch01 crtSrch01() {
		MSBFL_PrcdLotInspReg lgc = new MSBFL_PrcdLotInspReg();
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
	public mcframe.serverMSBF.MSBFL0020.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBF.MSBFL0020.Srch01_CndR.create();
	}
	protected MSBFL_PrcdLotInspReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBFL0020_Chk01_INFO;
		this.aChk01 = ((MSBFL_PrcdLotInspReg)this).new Chk01();
	}

	public static MSBFL_PrcdLotInspReg.Chk01 crtChk01() {
		MSBFL_PrcdLotInspReg lgc = new MSBFL_PrcdLotInspReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0020.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();
	}
	protected MSBFL_PrcdLotInspReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBFL0020_Chk02_INFO;
		this.aChk02 = ((MSBFL_PrcdLotInspReg)this).new Chk02();
	}

	public static MSBFL_PrcdLotInspReg.Chk02 crtChk02() {
		MSBFL_PrcdLotInspReg lgc = new MSBFL_PrcdLotInspReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0020.Chk02_CndR createChk02_CndR(){
		return mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();
	}
	protected MSBFL_PrcdLotInspReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBFL0020_Ins01_INFO;
		this.aIns01 = ((MSBFL_PrcdLotInspReg)this).new Ins01();
	}

	public static MSBFL_PrcdLotInspReg.Ins01 crtIns01() {
		MSBFL_PrcdLotInspReg lgc = new MSBFL_PrcdLotInspReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addDownBlock(aIns01.down0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0020.Chk01_CndR createIns01_CndR(){
		return mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();
	}
	protected MSBFL_PrcdLotInspReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBFL0020_Del01_INFO;
		this.aDel01 = ((MSBFL_PrcdLotInspReg)this).new Del01();
	}

	public static MSBFL_PrcdLotInspReg.Del01 crtDel01() {
		MSBFL_PrcdLotInspReg lgc = new MSBFL_PrcdLotInspReg();
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
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0020.Chk02_CndR createDel01_CndR(){
		return mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品管関連マスタを検索する<br>
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
		private final mcframe.serverMSBF.MSBFL0020.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0020.Srch01_CndR down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0020.Srch01_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0020.Srch01_CndR.create();

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
			invoke((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0020.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBF.MSBFL0020.Srch01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Srch01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_insp_valid_flg</td></tr>
		 * 	<tr><td><br></td><td>no_spec_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Srch01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Srch01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 先行検査の検査予定を登録する前に、チェックを実行する<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0020.Chk01_CndR up0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();

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
			invoke((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Chk01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 先行検査の検査予定を取り消す前に、チェックを実行する<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0020.Chk02_CndR up0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();

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
			invoke((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk02_CndR createChk02_CndR(){
			return mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Chk02_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 先行検査の検査予定の登録を行う<br>
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
		private final mcframe.serverMSBF.MSBFL0020.Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0020.Chk01_CndR down0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBF.MSBFL0020.Chk01_CndR （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBF.MSBFL0020.Chk01_CndR chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBF.MSBFL0020.Chk01_CndR)chk01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMSBF.MSBFL0020.Chk01_CndR （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk01_CndR createIns01_CndR(){
			return mcframe.serverMSBF.MSBFL0020.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Chk01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Chk01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMSBF.MSBFL0020.Chk01_CndR dest0_0, mcframe.serverMSBF.MSBFL0020.Chk01_CndR src_Ins01_Cnd){
			up_CALL_OPE01_chk01_0(dest0_0, src_Ins01_Cnd);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("master_dt", "master_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMSBF.MSBFL0020.Chk01_CndR dest, mcframe.serverMSBF.MSBFL0020.Chk01_CndR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 先行検査の検査予定の取消を行う<br>
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
		private final mcframe.serverMSBF.MSBFL0020.Chk02_CndR up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk02 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk02}<br>
		 */
		public final mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.Chk02 chk01;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBF.MSBFL0020.MSBFL_PrcdLotInspReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk02_CndR createDel01_CndR(){
			return mcframe.serverMSBF.MSBFL0020.Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0020.Chk02_CndR
		 */
		public mcframe.serverMSBF.MSBFL0020.Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PrcdLotInspReg)MSBFL_PrcdLotInspReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(){
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}