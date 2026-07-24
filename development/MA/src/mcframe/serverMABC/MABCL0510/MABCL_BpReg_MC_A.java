package mcframe.serverMABC.MABCL0510;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_BpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_BpReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0510";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_BpReg.Bp_DelChk01 aBp_DelChk01;

	protected void initBp_DelChk01() {
		this.info = PDef.MA_MABCL0510_Bp_DelChk01_INFO;
		this.aBp_DelChk01 = ((MABCL_BpReg)this).new Bp_DelChk01();
	}

	public static MABCL_BpReg.Bp_DelChk01 crtBp_DelChk01() {
		MABCL_BpReg lgc = new MABCL_BpReg();
		lgc.initBp_DelChk01();
		return lgc.aBp_DelChk01;
	}

	protected void paramBp_DelChk01(MCParam p) {
		if (this.aBp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_DelChk01.up0());
	}

	protected void doBp_DelChk01() {
		aBp_DelChk01.call();
	};

	/**
	 * Bp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
	}

	/**
	 * Bp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
	}
	protected MABCL_BpReg.Bp_DelChk02 aBp_DelChk02;

	protected void initBp_DelChk02() {
		this.info = PDef.MA_MABCL0510_Bp_DelChk02_INFO;
		this.aBp_DelChk02 = ((MABCL_BpReg)this).new Bp_DelChk02();
	}

	public static MABCL_BpReg.Bp_DelChk02 crtBp_DelChk02() {
		MABCL_BpReg lgc = new MABCL_BpReg();
		lgc.initBp_DelChk02();
		return lgc.aBp_DelChk02;
	}

	protected void paramBp_DelChk02(MCParam p) {
		if (this.aBp_DelChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_DelChk02.up0());
	}

	protected void doBp_DelChk02() {
		aBp_DelChk02.call();
	};

	/**
	 * Bp_DelChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_DelChk02_DtlR(){
		return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
	}

	/**
	 * Bp_DelChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_DelChk02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
	}
	protected MABCL_BpReg.Bp_Del01 aBp_Del01;

	protected void initBp_Del01() {
		this.info = PDef.MA_MABCL0510_Bp_Del01_INFO;
		this.aBp_Del01 = ((MABCL_BpReg)this).new Bp_Del01();
	}

	public static MABCL_BpReg.Bp_Del01 crtBp_Del01() {
		MABCL_BpReg lgc = new MABCL_BpReg();
		lgc.initBp_Del01();
		return lgc.aBp_Del01;
	}

	protected void paramBp_Del01(MCParam p) {
		if (this.aBp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_Del01.up0());
	}

	protected void doBp_Del01() {
		aBp_Del01.call();
	};

	/**
	 * Bp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
	}

	/**
	 * Bp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
	}
	protected MABCL_BpReg.Bp_Del02 aBp_Del02;

	protected void initBp_Del02() {
		this.info = PDef.MA_MABCL0510_Bp_Del02_INFO;
		this.aBp_Del02 = ((MABCL_BpReg)this).new Bp_Del02();
	}

	public static MABCL_BpReg.Bp_Del02 crtBp_Del02() {
		MABCL_BpReg lgc = new MABCL_BpReg();
		lgc.initBp_Del02();
		return lgc.aBp_Del02;
	}

	protected void paramBp_Del02(MCParam p) {
		if (this.aBp_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_Del02.up0());
	}

	protected void doBp_Del02() {
		aBp_Del02.call();
	};

	/**
	 * Bp_Del02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_Del02_DtlR(){
		return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
	}

	/**
	 * Bp_Del02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_Del02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
	}
	protected MABCL_BpReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0510_Srch01_INFO;
		this.aSrch01 = ((MABCL_BpReg)this).new Srch01();
	}

	public static MABCL_BpReg.Srch01 crtSrch01() {
		MABCL_BpReg lgc = new MABCL_BpReg();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0510.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.Srch01_Rslt1R createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_SubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.Srch01_RsltR createSrch01_SubR(){
		return mcframe.serverMABC.MABCL0420.Srch01_RsltR.create();
	}

	/**
	 * Srch01_SubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> createSrch01_SubL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);
	}

	/**
	 * Srch01_LclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0500.Srch01_RsltR createSrch01_LclR(){
		return mcframe.serverMABC.MABCL0500.Srch01_RsltR.create();
	}

	/**
	 * Srch01_LclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> createSrch01_LclL(){
		return MCList.create(mcframe.serverMABC.MABCL0500.Srch01_RsltR.class);
	}
	protected MABCL_BpReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0510_Upd01_INFO;
		this.aUpd01 = ((MABCL_BpReg)this).new Upd01();
	}

	public static MABCL_BpReg.Upd01 crtUpd01() {
		MABCL_BpReg lgc = new MABCL_BpReg();
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
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_SubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createUpd01_SubR(){
		return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_SubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createUpd01_SubL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_LclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR createUpd01_LclR(){
		return mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_LclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> createUpd01_LclL(){
		return MCList.create(mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMABC.MABCL0520.Upd01_CndR.create();
	}
	protected MABCL_BpReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0510_Del01_INFO;
		this.aDel01 = ((MABCL_BpReg)this).new Del01();
	}

	public static MABCL_BpReg.Del01 crtDel01() {
		MABCL_BpReg lgc = new MABCL_BpReg();
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
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Bp_DelChk01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	abstract public class Bp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);

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
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
		}

		/**
		 * Bp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}


	}
	/**
	 * Bp_DelChk02オペレーション.<p>
	 *
	 * 取引先マスタ(共通・全社)の削除チェックを行います。<br>
	 */
	abstract public class Bp_DelChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_DelChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bp_DelChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);

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
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_DelChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_DelChk02_DtlR(){
			return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
		}

		/**
		 * Bp_DelChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_DelChk02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}


	}
	/**
	 * Bp_Del01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	abstract public class Bp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_LCL_R> updMaster2;
		/**
		 * DBC連携 updMaster3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> updMaster3;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster1_up0;
		public final MCList<MAM_BP_LCL_R> updMaster2_up0;
		public final MCList<MAM_BP_SUB_R> updMaster3_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_BP_R.create("T1"));
			updMaster2 = MCController.create(MAM_BP_LCL_R.create("T1"));
			updMaster3 = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_BP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_BP_LCL_R>)updMaster2.up(1);
			updMaster3_up0 = (MCList<MAM_BP_SUB_R>)updMaster3.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
			appendOpe(UPDATE, updMaster3);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, updMaster3_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
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
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
		}

		/**
		 * Bp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<MAM_BP_LCL_R> dest1_0, MCList<MAM_BP_SUB_R> dest2_0, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src_Bp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Bp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Bp_Del01_Dtl);
			up_UPDATE_updMaster3_0(dest2_0, src_Bp_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster2_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster2_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_BP_LCL_R r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_BP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				MAM_BP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster3_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster3_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster3_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster3_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster3_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Bp_Del02オペレーション.<p>
	 *
	 * 取引先マスタ(共通、全社)の削除を行います。<br>
	 */
	abstract public class Bp_Del02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bp_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);

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
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_Del02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createBp_Del02_DtlR(){
			return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
		}

		/**
		 * Bp_Del02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createBp_Del02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先マスタの検索を行います。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0510.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> down2;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.Srch01 （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * 連携オペレーション c0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0520.Srch01_CndR （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.Srch01_Rslt1R&gt; （{@link #c0_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.Srch01 c0;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0520.Srch01_CndR c0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Srch01 （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * 連携オペレーション c1<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0420.Srch01_CndR （{@link #c1_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.Srch01_RsltR&gt; （{@link #c1_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Srch01 c1;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0420.Srch01_CndR c1_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Srch01 （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * 連携オペレーション c2<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0500.Srch01_CndR （{@link #c2_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0500.Srch01_RsltR&gt; （{@link #c2_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Srch01 c2;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0500.Srch01_CndR c2_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> c2_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0510.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0500.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtSrch01();
			c1 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtSrch01();
			c2 = mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.crtSrch01();
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (mcframe.serverMABC.MABCL0520.Srch01_CndR)c0.up(0);
			c0_down0 = (MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R>)c0.down(0);
			c1_up0 = (mcframe.serverMABC.MABCL0420.Srch01_CndR)c1.up(0);
			c1_down0 = (MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR>)c1.down(0);
			c2_up0 = (mcframe.serverMABC.MABCL0500.Srch01_CndR)c2.up(0);
			c2_down0 = (MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR>)c2.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => mcframe.serverMABC.MABCL0520.Srch01_CndR （{@link #c0_up0}）<br>
		 * SELECT_SUB1<br>
		 * up0() => mcframe.serverMABC.MABCL0420.Srch01_CndR （{@link #c1_up0}）<br>
		 * SELECT_SUB2<br>
		 * up0() => mcframe.serverMABC.MABCL0500.Srch01_CndR （{@link #c2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1(c1_up0, up0());
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2(c2_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0520.Srch01_Rslt1R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0420.Srch01_RsltR&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0500.Srch01_RsltR&gt;（{@link #c2_down0}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0510.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.Srch01_Rslt1R createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_SubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.Srch01_RsltR createSrch01_SubR(){
			return mcframe.serverMABC.MABCL0420.Srch01_RsltR.create();
		}

		/**
		 * Srch01_SubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> createSrch01_SubL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);
		}

		/**
		 * Srch01_LclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0500.Srch01_RsltR createSrch01_LclR(){
			return mcframe.serverMABC.MABCL0500.Srch01_RsltR.create();
		}

		/**
		 * Srch01_LclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> createSrch01_LclL(){
			return MCList.create(mcframe.serverMABC.MABCL0500.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0510.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0510.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>com_use_flg</td></tr>
		 * 	<tr><td><br></td><td>com_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_ts_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no_c</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>del_ts_c</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * 	<tr><td><br></td><td>bp_com_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm_std</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(mcframe.serverMABC.MABCL0520.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0510.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(mcframe.serverMABC.MABCL0520.Srch01_CndR dest, mcframe.serverMABC.MABCL0510.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(mcframe.serverMABC.MABCL0420.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0510.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB1_c1_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_up_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0420.Srch01_CndR dest, mcframe.serverMABC.MABCL0510.Srch01_CndR src) {
			createMap_up_SELECT_SUB1_c1_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(mcframe.serverMABC.MABCL0500.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0510.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB2_c2_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_up_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("reg_flg", "reg_flg");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0500.Srch01_CndR dest, mcframe.serverMABC.MABCL0510.Srch01_CndR src) {
			createMap_up_SELECT_SUB2_c2_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> dest_Srch01_Rslt, MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm_lcl", "bp_nm_lcl");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("com_use_flg", "com_use_flg");
				addColumnPathMap("com_ex_flg", "com_ex_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("area_nm", "area_nm");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("prnt_lcl_nm", "prnt_lcl_nm");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_nm1", "bp_grp_nm1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_nm2", "bp_grp_nm2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_nm3", "bp_grp_nm3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_nm4", "bp_grp_nm4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_nm5", "bp_grp_nm5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_nm6", "bp_grp_nm6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_nm7", "bp_grp_nm7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_nm8", "bp_grp_nm8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_nm9", "bp_grp_nm9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_grp_nm10", "bp_grp_nm10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("ins_usr_id_c", "ins_usr_id_c");
				addColumnPathMap("ins_usr_nm_c", "ins_usr_nm_c");
				addColumnPathMap("ins_ts_c", "ins_ts_c");
				addColumnPathMap("ins_func_id_c", "ins_func_id_c");
				addColumnPathMap("ins_func_nm_c", "ins_func_nm_c");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_usr_id_c", "upd_usr_id_c");
				addColumnPathMap("upd_usr_nm_c", "upd_usr_nm_c");
				addColumnPathMap("upd_ts_c", "upd_ts_c");
				addColumnPathMap("upd_func_id_c", "upd_func_id_c");
				addColumnPathMap("upd_func_nm_c", "upd_func_nm_c");
				addColumnPathMap("upd_srv_req_no_c", "upd_srv_req_no_c");
				addColumnPathMap("del_usr_id_c", "del_usr_id_c");
				addColumnPathMap("del_usr_nm_c", "del_usr_nm_c");
				addColumnPathMap("del_ts_c", "del_ts_c");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("acst_nm", "acst_nm");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_typ_nm", "ar_dpt_typ_nm");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_req_typ_nm", "sls_upri_req_typ_nm");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_upri_rnd_typ_nm", "sls_upri_rnd_typ_nm");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ_nm", "sls_amt_rnd_typ_nm");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_calc_typ_nm", "sls_tax_calc_typ_nm");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_tax_rnd_typ_nm", "sls_tax_rnd_typ_nm");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("sls_basis_typ_nm", "sls_basis_typ_nm");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("bill_basis_typ_nm", "bill_basis_typ_nm");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("ship_schd_split_typ_nm", "ship_schd_split_typ_nm");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("lot_back_stop_typ_nm", "lot_back_stop_typ_nm");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("slip_each_lot_typ_nm", "slip_each_lot_typ_nm");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("cst_ship_form_nm", "cst_ship_form_nm");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("stk_lst_form_nm", "stk_lst_form_nm");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_nm1", "cst_tterm_nm1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_nm2", "cst_tterm_nm2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("cst_tterm_nm3", "cst_tterm_nm3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("bcst_nm", "bcst_nm");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("rcst_nm", "rcst_nm");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("ar_cred_nm", "ar_cred_nm");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bill_dpt_typ_nm", "bill_dpt_typ_nm");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_typ_nm", "bill_cl_typ_nm");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_tax_rnd_typ_nm", "bill_tax_rnd_typ_nm");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("bill_cl_ba_typ_nm", "bill_cl_ba_typ_nm");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("bill_cal_nm", "bill_cal_nm");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("rcv_ba_typ_nm", "rcv_ba_typ_nm");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("sls_dtl_outp_typ_nm", "sls_dtl_outp_typ_nm");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_prnt_typ_nm", "bill_prnt_typ_nm");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_subttl_typ_nm", "bill_dtl_subttl_typ_nm");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_brk_typ_nm", "bill_dtl_brk_typ_nm");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_dtl_sort_typ_nm", "bill_dtl_sort_typ_nm");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("bill_can_slip_typ_nm", "bill_can_slip_typ_nm");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("ar_setoff_grp_nm", "ar_setoff_grp_nm");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("via_dlv_typ_nm", "via_dlv_typ_nm");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_cal_nm", "dlv_cal_nm");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("po_print_nm", "po_print_nm");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("sppl_ship_form_nm", "sppl_ship_form_nm");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_req_typ_nm", "purc_upri_req_typ_nm");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_amt_rnd_typ_nm", "purc_amt_rnd_typ_nm");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ_nm", "purc_tax_rnd_typ_nm");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_calc_typ_nm", "purc_tax_calc_typ_nm");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("purc_slip_each_lot_typ_nm", "purc_slip_each_lot_typ_nm");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("prov_rcv_typ_nm", "prov_rcv_typ_nm");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("outsrc_upri_typ_nm", "outsrc_upri_typ_nm");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_basis_typ_nm", "prov_basis_typ_nm");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_amt_rnd_typ_nm", "prov_amt_rnd_typ_nm");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ_nm", "prov_tax_rnd_typ_nm");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_calc_typ_nm", "prov_tax_calc_typ_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_cal_nm", "sppl_cal_nm");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_nm1", "sppl_tterm_nm1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_nm2", "sppl_tterm_nm2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("sppl_tterm_nm3", "sppl_tterm_nm3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("purc_basis_typ_nm", "purc_basis_typ_nm");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_nm", "bsppl_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("psppl_nm", "psppl_nm");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("ap_cred_nm", "ap_cred_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("ap_setoff_grp_nm", "ap_setoff_grp_nm");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_nm", "pay_bank_ac_nm");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_subttl_typ_nm", "pay_ntc_dtl_subttl_typ_nm");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ_nm", "pay_ntc_dtl_brk_typ_nm");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ_nm", "pay_ntc_dtl_sort_typ_nm");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("pay_ntc_can_slip_typ_nm", "pay_ntc_can_slip_typ_nm");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("cst_prnt_typ_nm", "cst_prnt_typ_nm");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("acst_prnt_typ_nm", "acst_prnt_typ_nm");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ_nm", "bcst_prnt_typ_nm");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ_nm", "rcst_prnt_typ_nm");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("dlv_prnt_typ_nm", "dlv_prnt_typ_nm");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("sppl_prnt_typ_nm", "sppl_prnt_typ_nm");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ_nm", "asppl_prnt_typ_nm");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ_nm", "bsppl_prnt_typ_nm");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ_nm", "psppl_prnt_typ_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
				addColumnPathMap("bp_com_upd_cntr", "bp_com_upd_cntr");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_dest, mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> dest, MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_src : src){
				mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> dest_Srch01_Sub, MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Sub, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0420.Srch01_RsltR r_dest, mcframe.serverMABC.MABCL0420.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> dest, MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(mcframe.serverMABC.MABCL0420.Srch01_RsltR r_src : src){
				mcframe.serverMABC.MABCL0420.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> dest_Srch01_Lcl, MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Lcl, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm_std", "bp_nm_std");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("lcl_nm", "lcl_nm");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0500.Srch01_RsltR r_dest, mcframe.serverMABC.MABCL0500.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> dest, MCList<mcframe.serverMABC.MABCL0500.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(mcframe.serverMABC.MABCL0500.Srch01_RsltR r_src : src){
				mcframe.serverMABC.MABCL0500.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0520.Upd01_CndR up3;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.Upd01 （{@link #ope01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション ope01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #ope01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0520.Upd01_CndR （{@link #ope01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.Upd01 ope01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> ope01_up0;
		public final mcframe.serverMABC.MABCL0520.Upd01_CndR ope01_up1;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Upd01 （{@link #ope02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション ope02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #ope02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.Upd01 ope02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> ope02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Upd01 （{@link #ope03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション ope03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR&gt; （{@link #ope03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.Upd01 ope03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> ope03_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR.class);
			up3 = mcframe.serverMABC.MABCL0520.Upd01_CndR.create();

			// 連携オペレーションの初期化
			ope01 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtUpd01();
			ope02 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtUpd01();
			ope03 = mcframe.serverMABC.MABCL0500.MABCL_BpLclReg.crtUpd01();
			
			// 連携オペレーションのコンテナ取得
			ope01_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR>)ope01.up(0);
			ope01_up1 = (mcframe.serverMABC.MABCL0520.Upd01_CndR)ope01.up(1);
			ope02_up0 = (MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR>)ope02.up(0);
			ope03_up0 = (MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR>)ope03.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, ope01);
			appendOpe(CALL_OPE02, ope02);
			appendOpe(CALL_OPE03, ope03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #ope01_up0}）<br>
		 * up3() => mcframe.serverMABC.MABCL0520.Upd01_CndR （{@link #ope01_up1}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #ope02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR&gt; （{@link #ope03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(ope01_up0, ope01_up1, up0(), up3());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(ope02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(ope03_up0, up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_SubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createUpd01_SubR(){
			return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_SubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createUpd01_SubL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_LclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR createUpd01_LclR(){
			return mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_LclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> createUpd01_LclL(){
			return MCList.create(mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMABC.MABCL0520.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>com_use_flg</td></tr>
		 * 	<tr><td><br></td><td>com_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>bp_com_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_only_com_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0520.Upd01_CndR
		 */
		public mcframe.serverMABC.MABCL0520.Upd01_CndR up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest0_0, mcframe.serverMABC.MABCL0520.Upd01_CndR dest0_1, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_Upd01_Dtl, mcframe.serverMABC.MABCL0520.Upd01_CndR src_Upd01_Cnd){
			up_CALL_OPE01_ope01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_ope01_1(dest0_1, src_Upd01_Cnd);
		}
		
		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_ope01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_ope01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_ope01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("com_use_flg", "com_use_flg");
				addColumnPathMap("com_ex_flg", "com_ex_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("check_ar_dpt_cd", "check_ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("check_bcst_dpt_cd", "check_bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("check_vmi_purc_dpt_cd", "check_vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("check_ap_dpt_cd", "check_ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("check_bsppl_dpt_cd", "check_bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("check_pay_dpt_cd", "check_pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("bp_com_upd_cntr", "bp_com_upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_ope01_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_ope01_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_ope01_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_ope01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_ope01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_ope01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_ope01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_only_com_flg", "upd_only_com_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_ope01_1(mcframe.serverMABC.MABCL0520.Upd01_CndR dest, mcframe.serverMABC.MABCL0520.Upd01_CndR src) {
			createMap_up_CALL_OPE01_ope01_1().copy(dest, src);
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src_Upd01_Sub){
			up_CALL_OPE02_ope02_0(dest0_0, src_Upd01_Sub);
		}
		
		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_ope02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_ope02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_ope02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_ope02_0(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_ope02_0(MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_ope02_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_ope02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> src_Upd01_Lcl){
			up_CALL_OPE03_ope03_0(dest0_0, src_Upd01_Lcl);
		}
		
		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_ope03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_ope03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_ope03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_ope03_0(mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_ope03_0(MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_ope03_0();
			for(mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0500.BpLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_ope03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
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
		private final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk02 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del02 （{@link #del02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_DelChk02 chk02;
		/**
		 * 連携オペレーション del02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #del02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0510.MABCL_BpReg.Bp_Del02 del02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> del02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0510.MABCL_BpReg.crtBp_DelChk01();
			del01 = mcframe.serverMABC.MABCL0510.MABCL_BpReg.crtBp_Del01();
			chk02 = mcframe.serverMABC.MABCL0510.MABCL_BpReg.crtBp_DelChk02();
			del02 = mcframe.serverMABC.MABCL0510.MABCL_BpReg.crtBp_Del02();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR>)del01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR>)chk02.up(0);
			del02_up0 = (MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR>)del02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, del02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 * CALL_OPE02<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR&gt; （{@link #del02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, del02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
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
			invoke((MABCL_BpReg)MABCL_BpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpReg)MABCL_BpReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE02_chk02_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE02_del02_0(dest1_0, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_del02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_del02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_del02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_del02_0(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_del02_0(MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_del02_0();
			for(mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0510.Bp_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_del02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}