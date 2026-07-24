package mcframe.serverMABC.MABCL0400;

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
 * "MABCL_ItmRlsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ItmRlsReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ItmRlsReg.ItmRls_UpdChk01 aItmRls_UpdChk01;

	protected void initItmRls_UpdChk01() {
		this.info = PDef.MA_MABCL0400_ItmRls_UpdChk01_INFO;
		this.aItmRls_UpdChk01 = ((MABCL_ItmRlsReg)this).new ItmRls_UpdChk01();
	}

	public static MABCL_ItmRlsReg.ItmRls_UpdChk01 crtItmRls_UpdChk01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_UpdChk01();
		return lgc.aItmRls_UpdChk01;
	}

	protected void paramItmRls_UpdChk01(MCParam p) {
		if (this.aItmRls_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_UpdChk01.up0());
	}

	protected void doItmRls_UpdChk01() {
		aItmRls_UpdChk01.call();
	};

	/**
	 * ItmRls_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createItmRls_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
	}

	/**
	 * ItmRls_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createItmRls_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.ItmRls_Upd01 aItmRls_Upd01;

	protected void initItmRls_Upd01() {
		this.info = PDef.MA_MABCL0400_ItmRls_Upd01_INFO;
		this.aItmRls_Upd01 = ((MABCL_ItmRlsReg)this).new ItmRls_Upd01();
	}

	public static MABCL_ItmRlsReg.ItmRls_Upd01 crtItmRls_Upd01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_Upd01();
		return lgc.aItmRls_Upd01;
	}

	protected void paramItmRls_Upd01(MCParam p) {
		if (this.aItmRls_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_Upd01.up0());
	}

	protected void doItmRls_Upd01() {
		aItmRls_Upd01.call();
	};

	/**
	 * ItmRls_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createItmRls_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
	}

	/**
	 * ItmRls_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createItmRls_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.ItmRls_DelChk01 aItmRls_DelChk01;

	protected void initItmRls_DelChk01() {
		this.info = PDef.MA_MABCL0400_ItmRls_DelChk01_INFO;
		this.aItmRls_DelChk01 = ((MABCL_ItmRlsReg)this).new ItmRls_DelChk01();
	}

	public static MABCL_ItmRlsReg.ItmRls_DelChk01 crtItmRls_DelChk01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_DelChk01();
		return lgc.aItmRls_DelChk01;
	}

	protected void paramItmRls_DelChk01(MCParam p) {
		if (this.aItmRls_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_DelChk01.up0());
	}

	protected void doItmRls_DelChk01() {
		aItmRls_DelChk01.call();
	};

	/**
	 * ItmRls_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createItmRls_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
	}

	/**
	 * ItmRls_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createItmRls_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.ItmRls_Del01 aItmRls_Del01;

	protected void initItmRls_Del01() {
		this.info = PDef.MA_MABCL0400_ItmRls_Del01_INFO;
		this.aItmRls_Del01 = ((MABCL_ItmRlsReg)this).new ItmRls_Del01();
	}

	public static MABCL_ItmRlsReg.ItmRls_Del01 crtItmRls_Del01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_Del01();
		return lgc.aItmRls_Del01;
	}

	protected void paramItmRls_Del01(MCParam p) {
		if (this.aItmRls_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_Del01.up0());
	}

	protected void doItmRls_Del01() {
		aItmRls_Del01.call();
	};

	/**
	 * ItmRls_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createItmRls_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
	}

	/**
	 * ItmRls_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createItmRls_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.ItmRls_UpdChk02 aItmRls_UpdChk02;

	protected void initItmRls_UpdChk02() {
		this.info = PDef.MA_MABCL0400_ItmRls_UpdChk02_INFO;
		this.aItmRls_UpdChk02 = ((MABCL_ItmRlsReg)this).new ItmRls_UpdChk02();
	}

	public static MABCL_ItmRlsReg.ItmRls_UpdChk02 crtItmRls_UpdChk02() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_UpdChk02();
		return lgc.aItmRls_UpdChk02;
	}

	protected void paramItmRls_UpdChk02(MCParam p) {
		if (this.aItmRls_UpdChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_UpdChk02.up0());
		p.addUpBlock(aItmRls_UpdChk02.up1());
	}

	protected void doItmRls_UpdChk02() {
		aItmRls_UpdChk02.call();
	};

	/**
	 * ItmRls_UpdChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createItmRls_UpdChk02_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
	}

	/**
	 * ItmRls_UpdChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createItmRls_UpdChk02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
	}

	/**
	 * ItmRls_UpdChk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createItmRls_UpdChk02_CndR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
	}
	protected MABCL_ItmRlsReg.ItmRls_Upd02 aItmRls_Upd02;

	protected void initItmRls_Upd02() {
		this.info = PDef.MA_MABCL0400_ItmRls_Upd02_INFO;
		this.aItmRls_Upd02 = ((MABCL_ItmRlsReg)this).new ItmRls_Upd02();
	}

	public static MABCL_ItmRlsReg.ItmRls_Upd02 crtItmRls_Upd02() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initItmRls_Upd02();
		return lgc.aItmRls_Upd02;
	}

	protected void paramItmRls_Upd02(MCParam p) {
		if (this.aItmRls_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmRls_Upd02.up0());
		p.addUpBlock(aItmRls_Upd02.up1());
	}

	protected void doItmRls_Upd02() {
		aItmRls_Upd02.call();
	};

	/**
	 * ItmRls_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createItmRls_Upd02_DtlR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
	}

	/**
	 * ItmRls_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createItmRls_Upd02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
	}

	/**
	 * ItmRls_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createItmRls_Upd02_CndR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
	}
	protected MABCL_ItmRlsReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0400_Srch01_INFO;
		this.aSrch01 = ((MABCL_ItmRlsReg)this).new Srch01();
	}

	public static MABCL_ItmRlsReg.Srch01 crtSrch01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
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
	public mcframe.serverMABC.MABCL0400.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0400.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0400.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0400.Srch01_Rslt1R.class);
	}
	protected MABCL_ItmRlsReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0400_Upd01_INFO;
		this.aUpd01 = ((MABCL_ItmRlsReg)this).new Upd01();
	}

	public static MABCL_ItmRlsReg.Upd01 crtUpd01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0400_Del01_INFO;
		this.aDel01 = ((MABCL_ItmRlsReg)this).new Del01();
	}

	public static MABCL_ItmRlsReg.Del01 crtDel01() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
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
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
	}
	protected MABCL_ItmRlsReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MA_MABCL0400_Upd02_INFO;
		this.aUpd02 = ((MABCL_ItmRlsReg)this).new Upd02();
	}

	public static MABCL_ItmRlsReg.Upd02 crtUpd02() {
		MABCL_ItmRlsReg lgc = new MABCL_ItmRlsReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addUpBlock(aUpd02.up1());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createUpd02_Dtl1R(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
	}

	/**
	 * Upd02_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createUpd02_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
	}

	/**
	 * Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createUpd02_CndR(){
		return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ItmRls_UpdChk01オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を登録する前のチェックを行う<br>
	 */
	abstract public class ItmRls_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmRls_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);

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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createItmRls_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
		}

		/**
		 * ItmRls_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createItmRls_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}


	}
	/**
	 * ItmRls_Upd01オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を登録する<br>
	 */
	abstract public class ItmRls_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmRls_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createItmRls_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
		}

		/**
		 * ItmRls_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createItmRls_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src_ItmRls_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmRls_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src_ItmRls_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmRls_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * ItmRls_DelChk01オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を取り消す前のチェックを行う<br>
	 */
	abstract public class ItmRls_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmRls_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);

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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createItmRls_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
		}

		/**
		 * ItmRls_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createItmRls_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}


	}
	/**
	 * ItmRls_Del01オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を取り消す<br>
	 */
	abstract public class ItmRls_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> updMaster1_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmRls_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ITM_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ITM_COM_R>)updMaster1.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster1_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createItmRls_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
		}

		/**
		 * ItmRls_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createItmRls_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src_ItmRls_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ItmRls_Del01_Dtl);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src_ItmRls_Del01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmRls_Del01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * ItmRls_UpdChk02オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を原価管理に反映する前のチェックを行う<br>
	 */
	abstract public class ItmRls_UpdChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_UpdChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1;
		
		
		// コンストラクタ
		protected ItmRls_UpdChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();

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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_UpdChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createItmRls_UpdChk02_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
		}

		/**
		 * ItmRls_UpdChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createItmRls_UpdChk02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
		}

		/**
		 * ItmRls_UpdChk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createItmRls_UpdChk02_CndR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}


	}
	/**
	 * ItmRls_Upd02オペレーション.<p>
	 *
	 * 品目マスタのリリース情報を原価管理に反映する前のチェックを行う<br>
	 */
	abstract public class ItmRls_Upd02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmRls_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1;
		
		
		// コンストラクタ
		protected ItmRls_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();

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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmRls_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createItmRls_Upd02_DtlR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
		}

		/**
		 * ItmRls_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createItmRls_Upd02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
		}

		/**
		 * ItmRls_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createItmRls_Upd02_CndR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
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
		private final mcframe.serverMABC.MABCL0400.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM__R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0400.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0400.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM__R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM__R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0400.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0400.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0400.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>sls_tar_out_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tar_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_no_input_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_tar_out_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_tar_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_no_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tar_out_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tar_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_no_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_tar_out_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_tar_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_no_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0400.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0400.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri</td></tr>
		 * 	<tr><td><br></td><td>cst_upri</td></tr>
		 * 	<tr><td><br></td><td>itm_upri</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>proc_upri</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>release_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ITM__R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
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
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("purc_upri", "purc_upri");
				addColumnPathMap("cst_upri", "cst_upri");
				addColumnPathMap("itm_upri", "itm_upri");
				addColumnPathMap("std_upri", "std_upri");
				addColumnPathMap("prov_upri", "prov_upri");
				addColumnPathMap("proc_upri", "proc_upri");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("memo1_c", "memo1_c");
				addColumnPathMap("memo2_c", "memo2_c");
				addColumnPathMap("memo3_c", "memo3_c");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_usr_nm", "release_usr_nm");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0400.Srch01_Rslt1R r_dest, MAM_ITM__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0400.Srch01_Rslt1R> dest, MCList<MAM_ITM__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM__R r_src : src){
				mcframe.serverMABC.MABCL0400.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
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
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
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
	 * 取消処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Del01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_DelChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Del01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_DelChk01();
			upd01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
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
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Del01_Dtl1);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 登録処理（原価管理）を行う<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk02 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd02 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR （{@link #chk01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_UpdChk02 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR&gt; （{@link #upd01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR （{@link #upd01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.ItmRls_Upd02 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> chk01_up0;
		public final mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR chk01_up1;
		public final MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> upd01_up0;
		public final mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR upd01_up1;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_UpdChk02();
			upd01 = mcframe.serverMABC.MABCL0400.MABCL_ItmRlsReg.crtItmRls_Upd02();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR>)chk01.up(0);
			chk01_up1 = (mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR)chk01.up(1);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR>)upd01.up(0);
			upd01_up1 = (mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR)upd01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR （{@link #chk01_up1}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR&gt; （{@link #upd01_up0}）<br>
		 * up1() => mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR （{@link #upd01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, upd01_up0, upd01_up1, up0(), up1());
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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd02_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR createUpd02_Dtl1R(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.create();
		}

		/**
		 * Upd02_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> createUpd02_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR.class);
		}

		/**
		 * Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR createUpd02_CndR(){
			return mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR
		 */
		public mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmRlsReg)MABCL_ItmRlsReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> dest0_0, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR dest0_1, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> dest1_0, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR dest1_1, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> src_Upd02_Dtl1, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR src_Upd02_Cnd){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd02_Dtl1);
			up_CALL_OPE01_chk01_1(dest0_1, src_Upd02_Cnd);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd02_Dtl1);
			up_CALL_OPE01_upd01_1(dest1_1, src_Upd02_Cnd);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("term", "term");
				addColumnPathMap("tgt_dt", "tgt_dt");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR src) {
			createMap_up_CALL_OPE01_chk01_1().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_src : src){
				mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("term", "term");
				addColumnPathMap("tgt_dt", "tgt_dt");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_1(mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR dest, mcframe.serverMABC.MABCL0400.ItmRls_UpdChk02_CndR src) {
			createMap_up_CALL_OPE01_upd01_1().copy(dest, src);
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