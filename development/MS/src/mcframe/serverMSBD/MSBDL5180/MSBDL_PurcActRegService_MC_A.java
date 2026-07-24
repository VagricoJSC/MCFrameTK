package mcframe.serverMSBD.MSBDL5180;

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
 * "MSBDL_PurcActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcActRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBDL5180";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcActRegService.Purc_Chk01 aPurc_Chk01;

	protected void initPurc_Chk01() {
		this.info = PDef.MS_MSBDL5180_Purc_Chk01_INFO;
		this.aPurc_Chk01 = ((MSBDL_PurcActRegService)this).new Purc_Chk01();
	}

	public static MSBDL_PurcActRegService.Purc_Chk01 crtPurc_Chk01() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Chk01();
		return lgc.aPurc_Chk01;
	}

	protected void paramPurc_Chk01(MCParam p) {
		if (this.aPurc_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Chk01.up0());
		p.addUpBlock(aPurc_Chk01.up1());
		p.addDownBlock(aPurc_Chk01.down0());
	}

	protected void doPurc_Chk01() {
		aPurc_Chk01.call();
	};

	/**
	 * Purc_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR createPurc_Chk01_CndR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR.create();
	}

	/**
	 * Purc_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR createPurc_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.create();
	}

	/**
	 * Purc_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> createPurc_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.class);
	}
	protected MSBDL_PurcActRegService.Purc_Chk02 aPurc_Chk02;

	protected void initPurc_Chk02() {
		this.info = PDef.MS_MSBDL5180_Purc_Chk02_INFO;
		this.aPurc_Chk02 = ((MSBDL_PurcActRegService)this).new Purc_Chk02();
	}

	public static MSBDL_PurcActRegService.Purc_Chk02 crtPurc_Chk02() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Chk02();
		return lgc.aPurc_Chk02;
	}

	protected void paramPurc_Chk02(MCParam p) {
		if (this.aPurc_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Chk02.up0());
		p.addDownBlock(aPurc_Chk02.down0());
	}

	protected void doPurc_Chk02() {
		aPurc_Chk02.call();
	};

	/**
	 * Purc_Chk02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR createPurc_Chk02_IoR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.create();
	}

	/**
	 * Purc_Chk02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> createPurc_Chk02_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.class);
	}

	/**
	 * Purc_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_HdrR createPurc_HdrR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_HdrR.create();
	}

	/**
	 * Purc_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_HdrR> createPurc_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_HdrR.class);
	}

	/**
	 * Purc_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_DtlR createPurc_DtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_DtlR.create();
	}

	/**
	 * Purc_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_DtlR> createPurc_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_DtlR.class);
	}

	/**
	 * Purc_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_IoR createPurc_IoR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_IoR.create();
	}

	/**
	 * Purc_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_IoR> createPurc_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_IoR.class);
	}
	protected MSBDL_PurcActRegService.Purc_Chk03 aPurc_Chk03;

	protected void initPurc_Chk03() {
		this.info = PDef.MS_MSBDL5180_Purc_Chk03_INFO;
		this.aPurc_Chk03 = ((MSBDL_PurcActRegService)this).new Purc_Chk03();
	}

	public static MSBDL_PurcActRegService.Purc_Chk03 crtPurc_Chk03() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Chk03();
		return lgc.aPurc_Chk03;
	}

	protected void paramPurc_Chk03(MCParam p) {
		if (this.aPurc_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Chk03.up0());
		p.addUpBlock(aPurc_Chk03.up1());
		p.addUpBlock(aPurc_Chk03.up2());
		p.addUpBlock(aPurc_Chk03.up3());
		p.addDownBlock(aPurc_Chk03.down0());
		p.addDownBlock(aPurc_Chk03.down1());
		p.addDownBlock(aPurc_Chk03.down2());
	}

	protected void doPurc_Chk03() {
		aPurc_Chk03.call();
	};

	/**
	 * Purc_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR createPurc_Chk03_HdrR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.create();
	}

	/**
	 * Purc_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> createPurc_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.class);
	}

	/**
	 * Purc_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR createPurc_Chk03_DtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.create();
	}

	/**
	 * Purc_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> createPurc_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.class);
	}

	/**
	 * Purc_Chk03_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR createPurc_Chk03_IoR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.create();
	}

	/**
	 * Purc_Chk03_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> createPurc_Chk03_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.class);
	}

	/**
	 * Purc_Chk03_CtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR createPurc_Chk03_CtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR.create();
	}
	protected MSBDL_PurcActRegService.Purc_Ins01 aPurc_Ins01;

	protected void initPurc_Ins01() {
		this.info = PDef.MS_MSBDL5180_Purc_Ins01_INFO;
		this.aPurc_Ins01 = ((MSBDL_PurcActRegService)this).new Purc_Ins01();
	}

	public static MSBDL_PurcActRegService.Purc_Ins01 crtPurc_Ins01() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Ins01();
		return lgc.aPurc_Ins01;
	}

	protected void paramPurc_Ins01(MCParam p) {
		if (this.aPurc_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Ins01.up0());
		p.addUpBlock(aPurc_Ins01.up1());
		p.addUpBlock(aPurc_Ins01.up2());
		p.addUpBlock(aPurc_Ins01.up3());
		p.addDownBlock(aPurc_Ins01.down0());
		p.addDownBlock(aPurc_Ins01.down1());
		p.addDownBlock(aPurc_Ins01.down2());
	}

	protected void doPurc_Ins01() {
		aPurc_Ins01.call();
	};

	/**
	 * Purc_Ins01_CtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR createPurc_Ins01_CtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
	}

	/**
	 * Purc_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Ins01_HdrR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
	}

	/**
	 * Purc_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
	}

	/**
	 * Purc_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Ins01_DtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
	}

	/**
	 * Purc_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
	}

	/**
	 * Purc_Ins01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Ins01_IoR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
	}

	/**
	 * Purc_Ins01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Ins01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
	}
	protected MSBDL_PurcActRegService.Purc_Upd01 aPurc_Upd01;

	protected void initPurc_Upd01() {
		this.info = PDef.MS_MSBDL5180_Purc_Upd01_INFO;
		this.aPurc_Upd01 = ((MSBDL_PurcActRegService)this).new Purc_Upd01();
	}

	public static MSBDL_PurcActRegService.Purc_Upd01 crtPurc_Upd01() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Upd01();
		return lgc.aPurc_Upd01;
	}

	protected void paramPurc_Upd01(MCParam p) {
		if (this.aPurc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Upd01.up0());
		p.addUpBlock(aPurc_Upd01.up1());
		p.addUpBlock(aPurc_Upd01.up2());
		p.addUpBlock(aPurc_Upd01.up3());
		p.addDownBlock(aPurc_Upd01.down0());
		p.addDownBlock(aPurc_Upd01.down1());
		p.addDownBlock(aPurc_Upd01.down2());
	}

	protected void doPurc_Upd01() {
		aPurc_Upd01.call();
	};
	protected MSBDL_PurcActRegService.Purc_Upd02 aPurc_Upd02;

	protected void initPurc_Upd02() {
		this.info = PDef.MS_MSBDL5180_Purc_Upd02_INFO;
		this.aPurc_Upd02 = ((MSBDL_PurcActRegService)this).new Purc_Upd02();
	}

	public static MSBDL_PurcActRegService.Purc_Upd02 crtPurc_Upd02() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Upd02();
		return lgc.aPurc_Upd02;
	}

	protected void paramPurc_Upd02(MCParam p) {
		if (this.aPurc_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Upd02.up0());
		p.addUpBlock(aPurc_Upd02.up1());
		p.addUpBlock(aPurc_Upd02.up2());
		p.addUpBlock(aPurc_Upd02.up3());
		p.addDownBlock(aPurc_Upd02.down0());
		p.addDownBlock(aPurc_Upd02.down1());
		p.addDownBlock(aPurc_Upd02.down2());
	}

	protected void doPurc_Upd02() {
		aPurc_Upd02.call();
	};

	/**
	 * Purc_Upd02_CtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR createPurc_Upd02_CtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR.create();
	}

	/**
	 * Purc_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Upd02_HdrR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
	}

	/**
	 * Purc_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
	}

	/**
	 * Purc_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Upd02_DtlR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
	}

	/**
	 * Purc_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
	}

	/**
	 * Purc_Upd02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Upd02_IoR(){
		return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
	}

	/**
	 * Purc_Upd02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Upd02_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
	}
	protected MSBDL_PurcActRegService.Purc_Del01 aPurc_Del01;

	protected void initPurc_Del01() {
		this.info = PDef.MS_MSBDL5180_Purc_Del01_INFO;
		this.aPurc_Del01 = ((MSBDL_PurcActRegService)this).new Purc_Del01();
	}

	public static MSBDL_PurcActRegService.Purc_Del01 crtPurc_Del01() {
		MSBDL_PurcActRegService lgc = new MSBDL_PurcActRegService();
		lgc.initPurc_Del01();
		return lgc.aPurc_Del01;
	}

	protected void paramPurc_Del01(MCParam p) {
		if (this.aPurc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurc_Del01.up0());
		p.addUpBlock(aPurc_Del01.up1());
		p.addUpBlock(aPurc_Del01.up2());
		p.addUpBlock(aPurc_Del01.up3());
	}

	protected void doPurc_Del01() {
		aPurc_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Purc_Chk01オペレーション.<p>
	 *
	 * 仕入明細訂正登録・仕入実績一覧登録画面から呼出すチェック処理<br>
	 */
	abstract public class Purc_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Purc_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Purc_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR createPurc_Chk01_CndR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR.create();
		}

		/**
		 * Purc_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR createPurc_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.create();
		}

		/**
		 * Purc_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> createPurc_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.po_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.slo_no</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> up1() {
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
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Chk02オペレーション.<p>
	 *
	 * 入荷実績サービスから呼出すチェック処理<br>
	 */
	abstract public class Purc_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> down0;
		/** [Purc_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_DtlR> aPurc_Dtl;
		/** [Purc_Hdr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_HdrR> aPurc_Hdr;
		/** [Purc_Io]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_IoR> aPurc_Io;
		
		
		// コンストラクタ
		protected Purc_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.class);
			aPurc_Dtl = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_DtlR.class);
			aPurc_Hdr = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_HdrR.class);
			aPurc_Io = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_IoR.class);

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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Purc_Chk02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR createPurc_Chk02_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.create();
		}

		/**
		 * Purc_Chk02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> createPurc_Chk02_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR.class);
		}

		/**
		 * Purc_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_HdrR createPurc_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_HdrR.create();
		}

		/**
		 * Purc_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_HdrR> createPurc_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_HdrR.class);
		}

		/**
		 * Purc_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_DtlR createPurc_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_DtlR.create();
		}

		/**
		 * Purc_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_DtlR> createPurc_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_DtlR.class);
		}

		/**
		 * Purc_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_IoR createPurc_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_IoR.create();
		}

		/**
		 * Purc_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_IoR> createPurc_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pai.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk02_IoR> down0() {
			return down0;
		}


		/**
		 * [Purc_Dtl]ブロックのコンテナaPurc_DtlLを返します。
		 *
		 * @return Purc_DtlL
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_DtlR> Purc_Dtl() {
			return aPurc_Dtl;
		}

		/**
		 * [Purc_Hdr]ブロックのコンテナaPurc_HdrLを返します。
		 *
		 * @return Purc_HdrL
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_HdrR> Purc_Hdr() {
			return aPurc_Hdr;
		}

		/**
		 * [Purc_Io]ブロックのコンテナaPurc_IoLを返します。
		 *
		 * @return Purc_IoL
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_IoR> Purc_Io() {
			return aPurc_Io;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Chk03オペレーション.<p>
	 *
	 */
	abstract public class Purc_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> down2;
		
		
		// コンストラクタ
		protected Purc_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.class);
			up3 = mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Purc_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR createPurc_Chk03_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.create();
		}

		/**
		 * Purc_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> createPurc_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR.class);
		}

		/**
		 * Purc_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR createPurc_Chk03_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.create();
		}

		/**
		 * Purc_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> createPurc_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR.class);
		}

		/**
		 * Purc_Chk03_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR createPurc_Chk03_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.create();
		}

		/**
		 * Purc_Chk03_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> createPurc_Chk03_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR.class);
		}

		/**
		 * Purc_Chk03_CtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR createPurc_Chk03_CtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>no_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.po_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>no_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_sync_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>no_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pai.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>crt_param_cache_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_reg_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_form_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Chk03_CtlR up3() {
			return up3;
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
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Ins01オペレーション.<p>
	 *
	 * 仕入実績を新規登録する<br>
	 */
	abstract public class Purc_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2;
		
		
		// コンストラクタ
		protected Purc_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Purc_Ins01_CtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR createPurc_Ins01_CtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Ins01_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
		}

		/**
		 * Purc_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Ins01_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
		}

		/**
		 * Purc_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
		}

		/**
		 * Purc_Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Ins01_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
		}

		/**
		 * Purc_Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Ins01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_reg_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_form_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_form_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.po_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.slo_no</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.upri_not_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pai.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>src_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Upd01オペレーション.<p>
	 *
	 * 仕入実績を更新する<br>
	 */
	abstract public class Purc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2;
		
		
		// コンストラクタ
		protected Purc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Purc_Ins01_CtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR createPurc_Ins01_CtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Ins01_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
		}

		/**
		 * Purc_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Ins01_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
		}

		/**
		 * Purc_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
		}

		/**
		 * Purc_Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Ins01_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
		}

		/**
		 * Purc_Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Ins01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_reg_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_form_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_form_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.po_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pa.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pad.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pad.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pad.re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.sno1</td></tr>
		 * 	<tr><td><br></td><td>pad.sno2</td></tr>
		 * 	<tr><td><br></td><td>pad.sno3</td></tr>
		 * 	<tr><td><br></td><td>pad.sno4</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pad.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.po_no</td></tr>
		 * 	<tr><td><br></td><td>pad.slo_no</td></tr>
		 * 	<tr><td><br></td><td>pad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pai.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pai.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pai.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pai.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Upd02オペレーション.<p>
	 *
	 * 仕入明細訂正、入荷実績サービス、検査実績サービスからキャッシュを利用して仕入実績を登録する<br>
	 */
	abstract public class Purc_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2;
		
		
		// コンストラクタ
		protected Purc_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
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
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Purc_Upd02_CtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR createPurc_Upd02_CtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR.create();
		}

		/**
		 * Purc_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Upd02_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
		}

		/**
		 * Purc_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
		}

		/**
		 * Purc_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Upd02_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
		}

		/**
		 * Purc_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
		}

		/**
		 * Purc_Upd02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Upd02_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
		}

		/**
		 * Purc_Upd02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Upd02_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_reg_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_srvs_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Upd02_CtlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pai.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}
	/**
	 * Purc_Del01オペレーション.<p>
	 *
	 */
	abstract public class Purc_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Purc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3;
		
		
		// コンストラクタ
		protected Purc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Purc_Ins01_CtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR createPurc_Ins01_CtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR createPurc_Ins01_HdrR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.create();
		}

		/**
		 * Purc_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> createPurc_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR.class);
		}

		/**
		 * Purc_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR createPurc_Ins01_DtlR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.create();
		}

		/**
		 * Purc_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> createPurc_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR.class);
		}

		/**
		 * Purc_Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR createPurc_Ins01_IoR(){
			return mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.create();
		}

		/**
		 * Purc_Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> createPurc_Ins01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_reg_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_srvs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR
		 */
		public mcframe.serverMSBD.MSBDL5180.Purc_Ins01_CtlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.po_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pad.po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pai.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pai.in_to_loc_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR> up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcActRegService)MSBDL_PurcActRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}