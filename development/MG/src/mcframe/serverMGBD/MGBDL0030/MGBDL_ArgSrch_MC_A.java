package mcframe.serverMGBD.MGBDL0030;

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
 * "MGBDL_ArgSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_ArgSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBDL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_ArgSrch.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBDL0030_Chk01_INFO;
		this.aChk01 = ((MGBDL_ArgSrch)this).new Chk01();
	}

	public static MGBDL_ArgSrch.Chk01 crtChk01() {
		MGBDL_ArgSrch lgc = new MGBDL_ArgSrch();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0030.DtlR createDtlR(){
		return mcframe.serverMGBD.MGBDL0030.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> createDtlL(){
		return mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
	}
	protected MGBDL_ArgSrch.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBDL0030_Upd01_INFO;
		this.aUpd01 = ((MGBDL_ArgSrch)this).new Upd01();
	}

	public static MGBDL_ArgSrch.Upd01 crtUpd01() {
		MGBDL_ArgSrch lgc = new MGBDL_ArgSrch();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};
	protected MGBDL_ArgSrch.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBDL0030_Del01_INFO;
		this.aDel01 = ((MGBDL_ArgSrch)this).new Del01();
	}

	public static MGBDL_ArgSrch.Del01 crtDel01() {
		MGBDL_ArgSrch lgc = new MGBDL_ArgSrch();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR createDtlR_0(){
		return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> createDtlL_0(){
		return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
	}

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0030.HdrR createHdrR(){
		return mcframe.serverMGBD.MGBDL0030.HdrR.create();
	}
	protected MGBDL_ArgSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0030_Srch01_INFO;
		this.aSrch01 = ((MGBDL_ArgSrch)this).new Srch01();
	}

	public static MGBDL_ArgSrch.Srch01 crtSrch01() {
		MGBDL_ArgSrch lgc = new MGBDL_ArgSrch();
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
	public mcframe.serverMGBD.MGBDL0030.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBD.MGBDL0030.Srch01_CndR.create();
	}
	protected MGBDL_ArgSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MG_MGBDL0030_Srch02_INFO;
		this.aSrch02 = ((MGBDL_ArgSrch)this).new Srch02();
	}

	public static MGBDL_ArgSrch.Srch02 crtSrch02() {
		MGBDL_ArgSrch lgc = new MGBDL_ArgSrch();
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
	public mcframe.serverMA.dbc.MAM_MENU_CONFIG_R createSrch02_CndR(){
		return mcframe.serverMA.dbc.MAM_MENU_CONFIG_R.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0030.Srch02_DtlR createSrch02_DtlR(){
		return mcframe.serverMGBD.MGBDL0030.Srch02_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0030.Srch02_DtlL<mcframe.serverMGBD.MGBDL0030.Srch02_DtlR> createSrch02_DtlL(){
		return mcframe.serverMGBD.MGBDL0030.Srch02_DtlL.createMG_MGBDL0030_Srch02_Dtl(mcframe.serverMGBD.MGBDL0030.Srch02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 訂正する前のチェックを行う<br>
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
		private final mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);

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
			invoke((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0030.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> up0() {
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
		 * @see mcframe.serverMGBD.MGBDL0030.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 訂正処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);

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
			invoke((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0030.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>non_del_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> up0() {
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
		 * @see mcframe.serverMGBD.MGBDL0030.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0030.HdrR up1;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
			up1 = mcframe.serverMGBD.MGBDL0030.HdrR.create();

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
			invoke((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
		}

		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.HdrR createHdrR(){
			return mcframe.serverMGBD.MGBDL0030.HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.HdrR
		 */
		public mcframe.serverMGBD.MGBDL0030.HdrR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this).info;
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
		private final mcframe.serverMGBD.MGBDL0030.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0030.Srch01_CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);

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
			invoke((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBD.MGBDL0030.Srch01_CndR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlR createDtlR(){
			return mcframe.serverMGBD.MGBDL0030.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> createDtlL(){
			return mcframe.serverMGBD.MGBDL0030.DtlL.createMG_MGBDL0030_Dtl(mcframe.serverMGBD.MGBDL0030.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>calc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>st_ym</td></tr>
		 * 	<tr><td><br></td><td>end_ym</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>fix_true_flg</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>fix_false_flg</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>non_del_true_flg</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>non_del_false_flg</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>calc_err_true_flg</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>calc_err_false_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.Srch01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0030.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>st_ym</td></tr>
		 * 	<tr><td><br></td><td>end_ym</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_st</td></tr>
		 * 	<tr><td><br></td><td>calc_fin</td></tr>
		 * 	<tr><td><br></td><td>alc_err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>adj_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>non_del_flg</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>other_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_limit_flg</td></tr>
		 * 	<tr><td><br></td><td>data_check_flg</td></tr>
		 * 	<tr><td><br></td><td>rate_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_err_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.DtlL<mcframe.serverMGBD.MGBDL0030.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 原価メニューの検索処理をする<br>
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
		private final mcframe.serverMA.dbc.MAM_MENU_CONFIG_R up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0030.Srch02_DtlL<mcframe.serverMGBD.MGBDL0030.Srch02_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMA.dbc.MAM_MENU_CONFIG_R.create();
			down0 = mcframe.serverMGBD.MGBDL0030.Srch02_DtlL.createMG_MGBDL0030_Srch02_Dtl(mcframe.serverMGBD.MGBDL0030.Srch02_DtlR.class);

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
			invoke((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMA.dbc.MAM_MENU_CONFIG_R createSrch02_CndR(){
			return mcframe.serverMA.dbc.MAM_MENU_CONFIG_R.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.Srch02_DtlR createSrch02_DtlR(){
			return mcframe.serverMGBD.MGBDL0030.Srch02_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0030.Srch02_DtlL<mcframe.serverMGBD.MGBDL0030.Srch02_DtlR> createSrch02_DtlL(){
			return mcframe.serverMGBD.MGBDL0030.Srch02_DtlL.createMG_MGBDL0030_Srch02_Dtl(mcframe.serverMGBD.MGBDL0030.Srch02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMA.dbc.MAM_MENU_CONFIG_R
		 */
		public mcframe.serverMA.dbc.MAM_MENU_CONFIG_R up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_no</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>scrn_id</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0030.Srch02_DtlL
		 */
		public mcframe.serverMGBD.MGBDL0030.Srch02_DtlL<mcframe.serverMGBD.MGBDL0030.Srch02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_ArgSrch)MGBDL_ArgSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}