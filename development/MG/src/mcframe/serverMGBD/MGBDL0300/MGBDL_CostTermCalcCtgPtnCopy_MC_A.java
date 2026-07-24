package mcframe.serverMGBD.MGBDL0300;

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
 * "MGBDL_CostTermCalcCtgPtnCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CostTermCalcCtgPtnCopy_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL0300";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CostTermCalcCtgPtnCopy.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBDL0300_Chk01_INFO;
		this.aChk01 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Chk01();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Chk01 crtChk01() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
		return mcframe.serverMGBD.MGBDL0300.HdrR.create();
	}

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
		return mcframe.serverMGBD.MGBDL0300.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
	}

	/**
	 * DelDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0300.DtlR createDelDtlR(){
		return mcframe.serverMGBD.MGBDL0300.DtlR.create();
	}

	/**
	 * DelDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDelDtlL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
	}
	protected MGBDL_CostTermCalcCtgPtnCopy.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBDL0300_Ins01_INFO;
		this.aIns01 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Ins01();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Ins01 crtIns01() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
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
	}

	protected void doIns01() {
		aIns01.call();
	};
	protected MGBDL_CostTermCalcCtgPtnCopy.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MG_MGBDL0300_Ins02_INFO;
		this.aIns02 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Ins02();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Ins02 crtIns02() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
		lgc.initIns02();
		return lgc.aIns02;
	}

	protected void paramIns02(MCParam p) {
		if (this.aIns02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns02.up0());
		p.addUpBlock(aIns02.up1());
	}

	protected void doIns02() {
		aIns02.call();
	};
	protected MGBDL_CostTermCalcCtgPtnCopy.Ins03 aIns03;

	protected void initIns03() {
		this.info = PDef.MG_MGBDL0300_Ins03_INFO;
		this.aIns03 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Ins03();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Ins03 crtIns03() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
		lgc.initIns03();
		return lgc.aIns03;
	}

	protected void paramIns03(MCParam p) {
		if (this.aIns03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns03.up0());
		p.addUpBlock(aIns03.up1());
	}

	protected void doIns03() {
		aIns03.call();
	};
	protected MGBDL_CostTermCalcCtgPtnCopy.Ins04 aIns04;

	protected void initIns04() {
		this.info = PDef.MG_MGBDL0300_Ins04_INFO;
		this.aIns04 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Ins04();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Ins04 crtIns04() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
		lgc.initIns04();
		return lgc.aIns04;
	}

	protected void paramIns04(MCParam p) {
		if (this.aIns04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns04.up0());
		p.addUpBlock(aIns04.up1());
	}

	protected void doIns04() {
		aIns04.call();
	};
	protected MGBDL_CostTermCalcCtgPtnCopy.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0300_Srch01_INFO;
		this.aSrch01 = ((MGBDL_CostTermCalcCtgPtnCopy)this).new Srch01();
	}

	public static MGBDL_CostTermCalcCtgPtnCopy.Srch01 crtSrch01() {
		MGBDL_CostTermCalcCtgPtnCopy lgc = new MGBDL_CostTermCalcCtgPtnCopy();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addUpBlock(aSrch01.up1());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * コピーする前のチェックを行う<br>
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
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
			down1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		/**
		 * DelDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDelDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DelDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDelDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 計算カテゴリ別コピー処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 期別コピー処理をする<br>
	 */
	abstract public class Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins03オペレーション.<p>
	 *
	 * 計画コピー処理をする<br>
	 */
	abstract public class Ins03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		
		
		// コンストラクタ
		protected Ins03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins04オペレーション.<p>
	 *
	 * 実績コピー処理をする<br>
	 */
	abstract public class Ins04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		
		
		// コンストラクタ
		protected Ins04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tab_ctg_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0300.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0300.HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);

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
			invoke((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0300.HdrR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0300.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0300.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> createDtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0300.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0300.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0300.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_copy_typ_key</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cnt_fr</td></tr>
		 * 	<tr><td><br></td><td>cnt_to</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0300.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostTermCalcCtgPtnCopy)MGBDL_CostTermCalcCtgPtnCopy_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}