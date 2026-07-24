package mcframe.serverMGBD.MGBDL0640;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMG.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MGBDL_CostItmCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CostItmCopyReg_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBDL0640";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CostItmCopyReg.CostItmCopy_Chk01 aCostItmCopy_Chk01;

	protected void initCostItmCopy_Chk01() {
		this.info = PDef.MG_MGBDL0640_CostItmCopy_Chk01_INFO;
		this.aCostItmCopy_Chk01 = ((MGBDL_CostItmCopyReg)this).new CostItmCopy_Chk01();
	}

	public static MGBDL_CostItmCopyReg.CostItmCopy_Chk01 crtCostItmCopy_Chk01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initCostItmCopy_Chk01();
		return lgc.aCostItmCopy_Chk01;
	}

	protected void paramCostItmCopy_Chk01(MCParam p) {
		if (this.aCostItmCopy_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmCopy_Chk01.up0());
		p.addDownBlock(aCostItmCopy_Chk01.down0());
	}

	protected void doCostItmCopy_Chk01() {
		aCostItmCopy_Chk01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
		return mcframe.serverMGBD.MGBDL0640.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
		return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
	}
	protected MGBDL_CostItmCopyReg.CostItmCopy_Chk02 aCostItmCopy_Chk02;

	protected void initCostItmCopy_Chk02() {
		this.info = PDef.MG_MGBDL0640_CostItmCopy_Chk02_INFO;
		this.aCostItmCopy_Chk02 = ((MGBDL_CostItmCopyReg)this).new CostItmCopy_Chk02();
	}

	public static MGBDL_CostItmCopyReg.CostItmCopy_Chk02 crtCostItmCopy_Chk02() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initCostItmCopy_Chk02();
		return lgc.aCostItmCopy_Chk02;
	}

	protected void paramCostItmCopy_Chk02(MCParam p) {
		if (this.aCostItmCopy_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmCopy_Chk02.up0());
		p.addDownBlock(aCostItmCopy_Chk02.down0());
	}

	protected void doCostItmCopy_Chk02() {
		aCostItmCopy_Chk02.call();
	};
	protected MGBDL_CostItmCopyReg.CostItmCopy_Ins01 aCostItmCopy_Ins01;

	protected void initCostItmCopy_Ins01() {
		this.info = PDef.MG_MGBDL0640_CostItmCopy_Ins01_INFO;
		this.aCostItmCopy_Ins01 = ((MGBDL_CostItmCopyReg)this).new CostItmCopy_Ins01();
	}

	public static MGBDL_CostItmCopyReg.CostItmCopy_Ins01 crtCostItmCopy_Ins01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initCostItmCopy_Ins01();
		return lgc.aCostItmCopy_Ins01;
	}

	protected void paramCostItmCopy_Ins01(MCParam p) {
		if (this.aCostItmCopy_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmCopy_Ins01.up0());
		p.addDownBlock(aCostItmCopy_Ins01.down0());
	}

	protected void doCostItmCopy_Ins01() {
		aCostItmCopy_Ins01.call();
	};
	protected MGBDL_CostItmCopyReg.CostItmCopy_Del01 aCostItmCopy_Del01;

	protected void initCostItmCopy_Del01() {
		this.info = PDef.MG_MGBDL0640_CostItmCopy_Del01_INFO;
		this.aCostItmCopy_Del01 = ((MGBDL_CostItmCopyReg)this).new CostItmCopy_Del01();
	}

	public static MGBDL_CostItmCopyReg.CostItmCopy_Del01 crtCostItmCopy_Del01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initCostItmCopy_Del01();
		return lgc.aCostItmCopy_Del01;
	}

	protected void paramCostItmCopy_Del01(MCParam p) {
		if (this.aCostItmCopy_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmCopy_Del01.up0());
		p.addDownBlock(aCostItmCopy_Del01.down0());
	}

	protected void doCostItmCopy_Del01() {
		aCostItmCopy_Del01.call();
	};
	protected MGBDL_CostItmCopyReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBDL0640_Ins01_INFO;
		this.aIns01 = ((MGBDL_CostItmCopyReg)this).new Ins01();
	}

	public static MGBDL_CostItmCopyReg.Ins01 crtIns01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};
	protected MGBDL_CostItmCopyReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBDL0640_Del01_INFO;
		this.aDel01 = ((MGBDL_CostItmCopyReg)this).new Del01();
	}

	public static MGBDL_CostItmCopyReg.Del01 crtDel01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};
	protected MGBDL_CostItmCopyReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0640_Srch01_INFO;
		this.aSrch01 = ((MGBDL_CostItmCopyReg)this).new Srch01();
	}

	public static MGBDL_CostItmCopyReg.Srch01 crtSrch01() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
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
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0640.CndR createCndR(){
		return mcframe.serverMGBD.MGBDL0640.CndR.create();
	}
	protected MGBDL_CostItmCopyReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MG_MGBDL0640_Srch02_INFO;
		this.aSrch02 = ((MGBDL_CostItmCopyReg)this).new Srch02();
	}

	public static MGBDL_CostItmCopyReg.Srch02 crtSrch02() {
		MGBDL_CostItmCopyReg lgc = new MGBDL_CostItmCopyReg();
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

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CostItmCopy_Chk01オペレーション.<p>
	 *
	 * コピーする前のチェックを行う<br>
	 */
	abstract public class CostItmCopy_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmCopy_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		
		// コンストラクタ
		protected CostItmCopy_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dest_asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dest_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * CostItmCopy_Chk02オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
	 */
	abstract public class CostItmCopy_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmCopy_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		
		// コンストラクタ
		protected CostItmCopy_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * CostItmCopy_Ins01オペレーション.<p>
	 *
	 * コピー処理をする<br>
	 */
	abstract public class CostItmCopy_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmCopy_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_R&gt; （{@link #i1}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_DTL_R&gt; （{@link #i2}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_OPER_R&gt; （{@link #i3}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_BOM_R&gt; （{@link #i4}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_WK_R&gt; （{@link #i5}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PURC_R&gt; （{@link #i6}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROC_R&gt; （{@link #i7}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROV_R&gt; （{@link #i8}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_SLS_R&gt; （{@link #i9}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_FIX_R&gt; （{@link #i10}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 i1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_R> i1;
		/**
		 * DBC連携 i2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_DTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_DTL_R> i2;
		/**
		 * DBC連携 i3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_OPER_R> i3;
		/**
		 * DBC連携 i4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_BOM_R> i4;
		/**
		 * DBC連携 i5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_WK_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_WK_R> i5;
		/**
		 * DBC連携 i6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PURC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PURC_R> i6;
		/**
		 * DBC連携 i7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROC_R> i7;
		/**
		 * DBC連携 i8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROV_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROV_R> i8;
		/**
		 * DBC連携 i9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_SLS_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_SLS_R> i9;
		/**
		 * DBC連携 i10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_FIX_R> i10;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostItmCopy_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

			// 連携オペレーションの初期化
			i1 = MCController.create(MGT_ITM_R.create("T1"));
			i2 = MCController.create(MGT_ITM_DTL_R.create("T1"));
			i3 = MCController.create(MGT_ITM_OPER_R.create("T1"));
			i4 = MCController.create(MGT_BOM_R.create("T1"));
			i5 = MCController.create(MGT_ITM_WK_R.create("T1"));
			i6 = MCController.create(MGT_ITM_PURC_R.create("T1"));
			i7 = MCController.create(MGT_ITM_PROC_R.create("T1"));
			i8 = MCController.create(MGT_ITM_PROV_R.create("T1"));
			i9 = MCController.create(MGT_ITM_SLS_R.create("T1"));
			i10 = MCController.create(MGT_ITM_FIX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(PI, i1);
			appendOpe(PI, i2);
			appendOpe(PI, i3);
			appendOpe(PI, i4);
			appendOpe(PI, i5);
			appendOpe(PI, i6);
			appendOpe(PI, i7);
			appendOpe(PI, i8);
			appendOpe(PI, i9);
			appendOpe(PI, i10);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}

		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}
	/**
	 * CostItmCopy_Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
	 */
	abstract public class CostItmCopy_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmCopy_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_R&gt; （{@link #i1}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_DTL_R&gt; （{@link #i2}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_OPER_R&gt; （{@link #i3}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_BOM_R&gt; （{@link #i4}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_WK_R&gt; （{@link #i5}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PURC_R&gt; （{@link #i6}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROC_R&gt; （{@link #i7}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROV_R&gt; （{@link #i8}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_SLS_R&gt; （{@link #i9}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_FIX_R&gt; （{@link #i10}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 i1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_R> i1;
		/**
		 * DBC連携 i2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_DTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_DTL_R> i2;
		/**
		 * DBC連携 i3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_OPER_R> i3;
		/**
		 * DBC連携 i4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_BOM_R> i4;
		/**
		 * DBC連携 i5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_WK_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_WK_R> i5;
		/**
		 * DBC連携 i6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PURC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PURC_R> i6;
		/**
		 * DBC連携 i7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROC_R> i7;
		/**
		 * DBC連携 i8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROV_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROV_R> i8;
		/**
		 * DBC連携 i9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_SLS_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_SLS_R> i9;
		/**
		 * DBC連携 i10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_FIX_R> i10;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostItmCopy_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

			// 連携オペレーションの初期化
			i1 = MCController.create(MGT_ITM_R.create("T1"));
			i2 = MCController.create(MGT_ITM_DTL_R.create("T1"));
			i3 = MCController.create(MGT_ITM_OPER_R.create("T1"));
			i4 = MCController.create(MGT_BOM_R.create("T1"));
			i5 = MCController.create(MGT_ITM_WK_R.create("T1"));
			i6 = MCController.create(MGT_ITM_PURC_R.create("T1"));
			i7 = MCController.create(MGT_ITM_PROC_R.create("T1"));
			i8 = MCController.create(MGT_ITM_PROV_R.create("T1"));
			i9 = MCController.create(MGT_ITM_SLS_R.create("T1"));
			i10 = MCController.create(MGT_ITM_FIX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(PI, i1);
			appendOpe(PI, i2);
			appendOpe(PI, i3);
			appendOpe(PI, i4);
			appendOpe(PI, i5);
			appendOpe(PI, i6);
			appendOpe(PI, i7);
			appendOpe(PI, i8);
			appendOpe(PI, i9);
			appendOpe(PI, i10);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}

		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * コピー処理をする(画面用)<br>
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
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする(画面用)<br>
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
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
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
		private final mcframe.serverMGBD.MGBDL0640.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_R&gt; （{@link #i1}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_DTL_R&gt; （{@link #i2}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_OPER_R&gt; （{@link #i3}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_BOM_R&gt; （{@link #i4}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_WK_R&gt; （{@link #i5}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PURC_R&gt; （{@link #i6}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROC_R&gt; （{@link #i7}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROV_R&gt; （{@link #i8}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_SLS_R&gt; （{@link #i9}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_FIX_R&gt; （{@link #i10}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 i1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_R> i1;
		/**
		 * DBC連携 i2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_DTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_DTL_R> i2;
		/**
		 * DBC連携 i3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_OPER_R> i3;
		/**
		 * DBC連携 i4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_BOM_R> i4;
		/**
		 * DBC連携 i5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_WK_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_WK_R> i5;
		/**
		 * DBC連携 i6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PURC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PURC_R> i6;
		/**
		 * DBC連携 i7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROC_R> i7;
		/**
		 * DBC連携 i8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROV_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROV_R> i8;
		/**
		 * DBC連携 i9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_SLS_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_SLS_R> i9;
		/**
		 * DBC連携 i10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_FIX_R> i10;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

			// 連携オペレーションの初期化
			i1 = MCController.create(MGT_ITM_R.create("T1"));
			i2 = MCController.create(MGT_ITM_DTL_R.create("T1"));
			i3 = MCController.create(MGT_ITM_OPER_R.create("T1"));
			i4 = MCController.create(MGT_BOM_R.create("T1"));
			i5 = MCController.create(MGT_ITM_WK_R.create("T1"));
			i6 = MCController.create(MGT_ITM_PURC_R.create("T1"));
			i7 = MCController.create(MGT_ITM_PROC_R.create("T1"));
			i8 = MCController.create(MGT_ITM_PROV_R.create("T1"));
			i9 = MCController.create(MGT_ITM_SLS_R.create("T1"));
			i10 = MCController.create(MGT_ITM_FIX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(PI, i1);
			appendOpe(PI, i2);
			appendOpe(PI, i3);
			appendOpe(PI, i4);
			appendOpe(PI, i5);
			appendOpe(PI, i6);
			appendOpe(PI, i7);
			appendOpe(PI, i8);
			appendOpe(PI, i9);
			appendOpe(PI, i10);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.CndR createCndR(){
			return mcframe.serverMGBD.MGBDL0640.CndR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>del_flg_on</td></tr>
		 * 	<tr><td><br></td><td>del_flg_off</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.CndR
		 */
		public mcframe.serverMGBD.MGBDL0640.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>mam_itm_</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_fix</td></tr>
		 * 	<tr><td><br></td><td>copy_mam_itm_</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}

		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 参照品目検索処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0640.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0;
		
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_R&gt; （{@link #i1}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_DTL_R&gt; （{@link #i2}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_OPER_R&gt; （{@link #i3}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_BOM_R&gt; （{@link #i4}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_WK_R&gt; （{@link #i5}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PURC_R&gt; （{@link #i6}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROC_R&gt; （{@link #i7}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_PROV_R&gt; （{@link #i8}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_SLS_R&gt; （{@link #i9}）<br>
		 * 連携先 MCDBSubOperation&lt;MGT_ITM_FIX_R&gt; （{@link #i10}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 i1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_R> i1;
		/**
		 * DBC連携 i2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_DTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_DTL_R> i2;
		/**
		 * DBC連携 i3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_OPER_R> i3;
		/**
		 * DBC連携 i4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_BOM_R> i4;
		/**
		 * DBC連携 i5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_WK_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_WK_R> i5;
		/**
		 * DBC連携 i6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PURC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PURC_R> i6;
		/**
		 * DBC連携 i7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROC_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROC_R> i7;
		/**
		 * DBC連携 i8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_PROV_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_PROV_R> i8;
		/**
		 * DBC連携 i9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_SLS_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_SLS_R> i9;
		/**
		 * DBC連携 i10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MGT_ITM_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MGT_ITM_FIX_R> i10;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0640.CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);

			// 連携オペレーションの初期化
			i1 = MCController.create(MGT_ITM_R.create("T1"));
			i2 = MCController.create(MGT_ITM_DTL_R.create("T1"));
			i3 = MCController.create(MGT_ITM_OPER_R.create("T1"));
			i4 = MCController.create(MGT_BOM_R.create("T1"));
			i5 = MCController.create(MGT_ITM_WK_R.create("T1"));
			i6 = MCController.create(MGT_ITM_PURC_R.create("T1"));
			i7 = MCController.create(MGT_ITM_PROC_R.create("T1"));
			i8 = MCController.create(MGT_ITM_PROV_R.create("T1"));
			i9 = MCController.create(MGT_ITM_SLS_R.create("T1"));
			i10 = MCController.create(MGT_ITM_FIX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(PI, i1);
			appendOpe(PI, i2);
			appendOpe(PI, i3);
			appendOpe(PI, i4);
			appendOpe(PI, i5);
			appendOpe(PI, i6);
			appendOpe(PI, i7);
			appendOpe(PI, i8);
			appendOpe(PI, i9);
			appendOpe(PI, i10);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.CndR createCndR(){
			return mcframe.serverMGBD.MGBDL0640.CndR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0640.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0640.DtlL.createMG_MGBDL0640_Dtl(mcframe.serverMGBD.MGBDL0640.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>del_flg_on</td></tr>
		 * 	<tr><td><br></td><td>del_flg_off</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.CndR
		 */
		public mcframe.serverMGBD.MGBDL0640.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>mam_itm_</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>mgt_itm_fix</td></tr>
		 * 	<tr><td><br></td><td>copy_mam_itm_</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_dtl</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_oper</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_bom</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_wk</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_purc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_proc</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_prov</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_sls</td></tr>
		 * 	<tr><td><br></td><td>copy_mgt_itm_fix</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0640.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0640.DtlL<mcframe.serverMGBD.MGBDL0640.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmCopyReg)MGBDL_CostItmCopyReg_MC_A.this).info;
		}

		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}